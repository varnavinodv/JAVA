import java.util.Scanner;
class Arm
{
 public static void main(String args[])
{
int n,num,temp,s=0;
Scanner input=new Scanner(System.in);
System.out.print("enter number");
n=input.nextInt();
num=n;
while(num!=0)
{
temp=num%10;
s=s+temp*temp*temp;
num=num/10;
}
if(s==n)
 System.out.println("It is armstrong");
else
 System.out.println("It is not armstrong");
}

}
