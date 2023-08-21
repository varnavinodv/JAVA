package temp;
import java.util.Scanner;
interface A2
{
void calculate();
}
public class Cels implements A2
{
Scanner input=new Scanner(System.in);
double f,c;
int i,n;
public void calculate()
{
System.out.println("enter the value of n:");
n=input.nextInt();
System.out.println("enter the f:");
f=input.nextDouble();
for(i=0;i<n;i++)
{
 c=((f-32)*5/9);
 System.out.println(f+" f="+c+ "c");
 f=f+1;
}
}
}
