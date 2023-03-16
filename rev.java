import java.util.Scanner;
class Rev
{
 public static void main(String args[])
 {

 int rem,num,rev=0;
 Scanner input=new Scanner(System.in);
 System.out.print("enter the number");
 num=input.nextInt();
 while(num!=0)
 {
  rem=num%10;
  rev=rev*10+rem;
  num=num/10;
 }
 System.out.println(rev);
 }
}
