import java.util.Scanner;
class Sum
{
 public static void main(String args[])
 {
 int d,s=0,a;
 Scanner input=new Scanner(System.in);
 System.out.println("enter the number");
 a=input.nextInt();
 while(a!=0)
 {
  d=a%10;
  s=s+d;
  a=a/10;
 }
 System.out.println("sum of digits"+s);
 }
}
