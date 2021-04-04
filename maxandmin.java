// finding max and min of two numbers
import java.util.Scanner;
class maxandmin{
	public static void main(String []args){
		int num1,num2,max,min;
		Scanner ob=new Scanner(System.in);
		System.out.printf("Enter the first number \n");
		num1 = ob.nextInt();
		System.out.printf("Enter the second number \n");
		num2 = ob.nextInt();
		if(num1>num2)
		{
			max=num1;
			min=num2;
		}	
		else{
			max=num2;
			min=num1;
		}
		System.out.printf("the max number is %d \nthe min number is %d\n ",max,min);
	}
}