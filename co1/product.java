import java.util.Scanner;
class Product
{
int pcode,price;
String pname;
void Read()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter product code:");
pcode=sc.nextInt();
System.out.println("Enter product Name:");
pname=sc.next();
System.out.println("Enter product price:");
price=sc.nextInt();
}
}
class Main
{
public static void main(String args[])
{
Product a=new Product();
Product b=new Product();
Product c=new Product();
a.Read();
b.Read();
c.Read();
if((a.price<b.price) && (a.price<c.price))
{
System.out.println("Product with pcode:"+a.pcode+",Product Name:"+a.pname+" has the lowest price:"+a.price);
}
else if((b.price<a.price) && (b.price<c.price))
System.out.println("Product with pcode:"+b.pcode+",Product Name:"+b.pname+" has the lowest price:"+b.price);
else
System.out.println("Product with pcode:"+c.pcode+",Product Name:"+c.pname+" has the lowest price:"+c.price);
}
}