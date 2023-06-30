import java.util.Scanner;
class Cpu
{
   int price;
Cpu(int p)
{
price=p;
}
class Processor
{
String mname;
int no_core;
Processor(String mn,int nc)
{
mname=mn;
no_core=nc;
}
void display()
{
System.out.println("PRICE OF PRODUCT:" +price);
System.out.println("MANUFACTURER:" +mname);
System.out.println("NO OF CORES:" +no_core);
 }
}
static class Ram
{
    static String memory;
    static String manufacturer;
 static void get(String mm,String mn2)
 {
    memory=mm;
    manufacturer=mn2;
 }
 static void show()
 {
   System.out.println("MEMORY:" +memory);
   System.out.println("MANUFACTURER:" +manufacturer);
}
} }
public class Maincpu
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the price:");
int p=sc.nextInt();
System.out.println("Enter the Manufacturer name:");
String m1=sc.next();
System.out.println("Enter the no of cores:");
int c=sc.nextInt();
System.out.println("Enter the memory:");
String m=sc.next();
System.out.println("Enter the Manufacturer:");
String m2=sc.next();
Cpu c1=new Cpu(p);
Cpu.Processor cp1=c1.new Processor(m1,c);
Cpu.Ram.get(m,m2);
cp1.display();
Cpu.Ram.show();
}

}