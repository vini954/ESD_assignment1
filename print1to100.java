import java.util.Scanner;
public class print1to100  
{  
public static void main(String args[])   
{  
int number ;  
int n;
Scanner ob= new Scanner(System.in);
System.out.printf("enter the initial digit :");
n = ob.nextInt();
System.out.printf("enter the final digit :");
number = ob.nextInt();
System.out.print("List of hundered numbers : "+number+": ");  
for (int i=n; i<=number; i++)   
{  

System.out.print(i + " ");  

}  
}  
}