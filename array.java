import java.util.Scanner;
class Main
{
 public static void main(String args[])

 {
 Scanner input=new Scanner(System.in);
 int arr[]=new int[5];
 System.out.println("enter 5 elements:");
 for(int i=0;i<5;i++)
  arr[i]=input.nextInt();
  System.out.println("the numbers are:");
 for(int i=0;i<5;i++)
  System.out.println(arr[i]);
 int temp;
 for (int i=0;i<5;i++)
 {
  for(int j=i;j<5;j++)
  {
  if (arr[i]>arr[j]){
   temp=arr[i];
   arr[i]=arr[j];
   arr[j]=temp;
}}}
 System.out.println("sorted array");
 for(int i=0;i<5;i++)
  System.out.println(arr[i]);
 int sum=0;
 for (int i=0;i<5;i++){
 sum=sum+arr[i];
 }
 System.out.println("the sum is:"+sum);
 System.out.println("the min value:"+arr[0]);
 System.out.println("the max value:"+arr[4]);
 System.out.println("enter the value to search");
 int search=input.nextInt();
 int c=0;
 for(int i=0;i<5;i++){
 if(arr[i]==search){
 c=i;
 break;

}}
 if(c>0)
  System.out.println("elemnt found at:"+c);
 else
  System.out.println("elemnt not fount");
}
 }
