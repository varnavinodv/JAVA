import java.util.Scanner;
class Main
{
 public static void main(String args[])
 {
 sum();
 }
 static void sum()
 {
  int d,s=0,a;
  Scanner input=new Scanner(System.in);
  System.out.println("enter num");
  a=input.nextInt();
  while(a!=0)
  {
  d=a%10;
  s=s+d;
  a=a/10;
  }
  System.out.println(s);
  }
}
