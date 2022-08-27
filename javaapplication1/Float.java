
package javaapplication1;
import java.util.Scanner;
public class Float 
{
public static void main(String[] args) 
{
Scanner obj=new Scanner(System.in);
double i;
System.out.println("Enter a float number:");
i=obj.nextDouble();
System.out.println("Small Integer not lesser than the number : "+Math.ceil(i));
System.out.println("Given Number : "+i);
System.out.println("Largest Integer not greater than the number : "+Math.floor(i));
}  
}
