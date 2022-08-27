
package javaapplication1;
import java.util.Scanner;
public class OddEven {

    public static void main(String[] args) {
   Scanner obj=new Scanner(System.in);
 int i,b;      
 int a[]=new int[20];
 System.out.println("Enter the size of array:");
 b=obj.nextInt();
 System.out.println("Enter the elements of array:");
 for(i=0;i<b;i++)
 {
    a[i]=obj.nextInt();
 }  
 System.out.println("Odd Numbers:");  
 for(i=0;i<b;i++)
 {  
 if(a[i]%2!=0)
 {  
 System.out.println(a[i]);  
 }  
 }  
 System.out.println("Even Numbers:");  
 for(i=0;i<b;i++)
 {  
 if(a[i]%2==0)
 {  
 System.out.println(a[i]);  
 }  
 }  
    }
    
}
