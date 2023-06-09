import java.util.Scanner;
class ComplexNum
{
int real,img;
ComplexNum(int real,int img)
{
this.real=real;
this.img=img;
}
void Addcomplex(ComplexNum firstnum,ComplexNum secondnum)

{
int a =firstnum.real+secondnum.real;
int b=firstnum.img+secondnum.img;
System.out.println(a+ "+" +b);
}
}
class Main
{
public static void main(String[]args)
{
Scanner input=new Scanner(System.in);

System.out.println("Enter the real part of first number");
 int real1=input.nextInt();
System.out.println("enter the imaginary part of first number");
 int img1=input.nextInt();
System.out.println("enter the real part of second number");
 int  real2=input.nextInt();
System.out.println("enter the imaginary part of second number");
 int img2=input.nextInt();
ComplexNum firstnum=new ComplexNum(real1,img1);
ComplexNum secondnum=new ComplexNum(real2,img2);
ComplexNum sum=new ComplexNum(0,0);
sum.Addcomplex(firstnum,secondnum);
}
}
