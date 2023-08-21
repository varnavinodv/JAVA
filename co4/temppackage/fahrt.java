package temp;
import java.util.Scanner;
interface A1
{
void calculate();
}
public class Fahrt implements A1
{
Scanner input=new Scanner(System.in);
double c,f;
int i,n;
public void calculate()
{
System.out.println("enter n:");
n=input.nextInt();
System.out.println("enter cel:");
c=input.nextDouble();
for(i=0;i<n;i++)
{
f=((c*9/5)+32);
System.out.println(c+"c="+f+"f");
c=c+1;
}
}
}

