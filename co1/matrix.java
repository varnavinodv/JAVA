import java.util.Scanner;
class Matrix{
int m,n;
int arr1[][]=new int[10][10];
int arr2[][]=new int[10][10];
int arr3[][]=new int[10][10];
Scanner input=new Scanner(System.in);
void insert(){

System.out.println("Enter the row size : ");
m=input.nextInt();
System.out.println("Enter the column size : ");
n=input.nextInt();
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
System.out.println("Enter element of first matrix : ");
arr1[i][j]=input.nextInt();
}
}
for(int x=0;x<m;x++){
for(int y=0;y<n;y++){
System.out.println("enter the element of second matrix : ");
arr2[x][y]=input.nextInt();
}
}
}

void add(){
for(int i=0;i<m;i++){
for(int j=0;j<n;j++){
arr3[i][j]=arr1[i][j]+arr2[i][j];
}
}
}
