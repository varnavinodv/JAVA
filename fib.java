import java.util.Scanner;
class Fib
{
 public static void main(String args[])
 {
 int a=0,b=1,s=0,c=1,n;
 Scanner input= new Scanner(System.in);
 System.out.print("enter number");
 n=input.nextInt();
 while(c<=n)
 {
 a=b;
 b=s;
 s=a+b;
 System.out.println(s);
 c=c+1;
 }
 }
}

