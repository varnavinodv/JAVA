import java.util.Scanner;
class Cal
{
    int a,b,c;
    void get()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("enter first number: ");
        a=input.nextInt();
        System.out.println("enter second number: ");
        b=input.nextInt();
        
    }
    void add()
    {
    c=a+b;
    System.out.println("Answer is :" +c);
    }
    void sub()
    {
    c=a-b;
    System.out.println("Answer is :" +c);
    }
    void div()
    {
    c=a/b;
    System.out.println("Answer is: " +c);
    }
    void mul()
    {
    c=a*b;
    System.out.println("Answer is: " +c);
    }
}
class Main{
    public static void main(String args[])
    {
        int choice=1;
        Cal c=new Cal();
        Scanner input=new Scanner(System.in);
         System.out.println("1.add 2.sub 3.div 4.mul 5.exit");
         while(choice<+5)
         {
             System.out.println("enter choice: ");
             choice=input.nextInt();
             if(choice==1)
             {
                 c.get();
                 c.add();
             }
             else if(choice==2)
             {
                 c.get();
                 c.sub();
             }
             else if(choice==3)
             {
                 c.get();
                 c.div();
             }
             else if(choice==4)
             {
                 c.get();
                 c.mul();
             }
             else
             {
                 break;
             }
             }
             }
    }
