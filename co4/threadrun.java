import java.util.Scanner;
class Fib implements Runnable
{
 int a=0,b=1,sum=0,n;
  public void get()
  {
   System.out.println("fib series");
   Scanner sc=new Scanner(System.in);
   System.out.println("enter num:");
   n=sc.nextInt();
  }
  public void run()
 {
  for(int i=1;i<=n;i++)
 {
 System.out.println(a);
 sum=a+b;
 a=b;
 b=sum;
 }
}
}
class Even implements Runnable
{
 int number,i;
 public void gets()
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("EVEN NUM");
  System.out.println(" enter num:");
  number=sc.nextInt();
}
public void run()
{
    for(i=1;i<=number;i++)
   {
    if(i%2==0)
    {
     System.out.println(i);
    }
}
}
}
class Main
{
 public static void main(String args[])
 {
  Fib f=new Fib();
  f.get();
  Thread t1=new Thread(f);
  t1.start();
  Even e=new Even();
  e.gets();
  Thread t2=new Thread(e);
  t2.start();
}
}
