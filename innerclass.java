import java.util.Scanner;
class Student
{
String n;
int r,m;
void display(String name,int rollno, int mark)
{
 n=name;
 r=rollno;
 m=mark;
}
class Sports
{
String a;
int b;
void show(String sname, int apoint)
{
 a=sname;
 b=apoint;
System.out.println("name:" +n);
System.out.println("rollno:" +r);
System.out.println("mark:" +m);
System.out.println("sports name:"+a);
System.out.println("Activity point:" +b);
}
}
}
class Main
{
public static void main(String args[])
{
 Scanner input=new Scanner(System.in);
 System.out.println("enter name:");
 String name=input.nextLine();
  String name=input.nextLine();
 System.out.println("entr rollno:");
 int rollno=input.nextInt();
 System.out.println("enter marks:");
 int mark=input.nextInt();
 System.out.println("enter sports name:");
 String sname=input.next();
 System.out.println("enter activity point:");
 int apoint=input.nextInt();
 Student s1=new Student();
 Student.Sports c1=s1.new Sports();
 s1.display(name,rollno,mark);
 c1.show(sname,apoint);
}
}

