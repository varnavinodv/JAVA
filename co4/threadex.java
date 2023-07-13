import java.util.Scanner;
class Multi extends Thread
{
int a=5,m;
public void run()
{
System.out.println("MULTIPLICATION TABLE");
for(int i=1;i<=10;i++)
{
m=a*i;
System.out.println(a+"*"+i+"="+m);
}
}
}
class Prime extends Thread
{
int i,j,k,n;
public void get()
{
Scanner sc=new Scanner(System.in);
System.out.println("/n first prime numbers");
System.out.println("enter the limit:");
n=sc.nextInt();
System.out.println("prime numbers between 1 and "+n+" are:");
}
public void run()
{
for(i=2;i<=n;i++)
{
k=0;
for(j=2;j<=i-1;j++)
{
if(i%j==0)
{
k=1;
break;
}
}
if(k==0)
System.out.println(i+"");
}
}
}
class Main
{
public static void main(String args[])
{
Multi m=new Multi();
m.start();
Prime p=new Prime();
p.get();
p.start();
}
}
 