// finding GCD and LCM of numbers
import java.util.Scanner;
class gcdandlcm{
	public static void main(String []args){
		int num1,num2,rem,numer,denom,lcm;
		Scanner ob=new Scanner(System.in);
		System.out.printf("Enter the first number \n");
		num1 = ob.nextInt();
		System.out.printf("Enetr the second number \n");
		num2 = ob.nextInt();
		if(num1>num2)
		{
			numer = num1;
			denom = num2;
		}
		else{
			numer = num2;
			denom = num1;
		}
		rem=numer%denom;
		while(rem!=0)
		{
			numer = denom;
			denom = rem;
			rem = numer%denom;
		}
		System.out.println("the gcd of numbers is "+denom);
		lcm=(num1*num2)/denom;
		System.out.println("the lcm of numbers is "+lcm);
	}
}