import temp.*;
import java.util.Scanner;
class Main
{
public static void main(String args[])
{
int c=0;
Scanner input=new Scanner(System.in);
temp.Fahrt f1=new temp.Fahrt();
temp.Cels c1=new temp.Cels();
System.out.println("1.cel to ft");
System.out.println("2.f to cel");
System.out.println("3.exit");
while(c<=3)
{
System.out.println("ENTER CHOICE");
c=input.nextInt();

if(c==1)
{
f1.calculate();
}
else if(c==2)
{
c1.calculate();
}
else
 break;
}

}
}
