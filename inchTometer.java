//program that reads a number in inches, converts it to meters(CLA)

import java.util.Scanner; 
public class inchTometer{ 
 	public static void main(String args[]){ 
 	
	int inch; 
 	System.out.printf("enter inch\n");  	 
	Scanner ob = new Scanner(System.in);  	 	
	inch= ob.nextInt();  	 	
	double meter = 0.0254 * inch;  	 	
	System.out.println(" In meters : "+meter); 
 	} 

} 
