import java.util.Scanner;
class Complex
{
int real,img;
Complex(int reall,int imgi)
{
real=reall;
img=imgi;
}
Complex add(Complex firstn,Complex secn)
{
Complex sum=new Complex(0,0);
sum.real=firstn.real+secn.real;
sum.img=firstn.img+secn.img;
return sum;

}
}
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the real part of first complex number:");
int real1=sc.nextInt();
System.out.println("Enter the imaginary part of second complex number:");
int real2=sc.nextInt();
System.out.println("Enter the real part of first complex number:");
int img1=sc.nextInt();
System.out.println("Enter the imaginary part of second complex number:");
int img2=sc.nextInt();
Complex firstn=new Complex(real1,img1);
Complex secn=new Complex(real2,img2);
Complex sum=new Complex(0,0);
sum=sum.add(firstn,secn);
System.out.println("The sum is: "+sum.real+"+"+sum.img+"i");

}}
                                  