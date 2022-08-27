package javaapplication1;
import java.util.Scanner;
public class Star
{
public static void printTriangle(int n)
{
for (int i=0; i<n; i++)
{
for (int j=n-i; j>1; j--)
{
System.out.print(" ");
}
for (int j=0; j<=i; j++ )
{
System.out.print("* ");
}
System.out.println();
}
}
public static void main(String args[])
{
 int n;
 Scanner obj=new Scanner(System.in);
 System.out.println("Enter the number of rows of triangle:");
 n=obj.nextInt();
 printTriangle(n);
}
}
