import java.util.Scanner;
public class repeatedoccurence{ 
 	public static void main(String args[]){  	 	
	int num,checkDigit,count=0,digit; 
 	 System.out.printf("enter number\n");  	 	
	Scanner ob = new Scanner(System.in);  	 	
	num = ob.nextInt(); 
 	System.out.printf("enter the digit which u want to check\n ");  	 	
	checkDigit=ob.nextInt();  	 	
	while(num > 0){  	 	 	
	digit = num % 10;  	 	 	
	if(checkDigit == digit){ 
 	 	 	 	
		count++; 
 	 	 	} 	 	 
 	 	 num = num / 10; 
 	 	} 
 	 System.out.println("count of "+checkDigit+" : "+count); 
 	} 
} 
