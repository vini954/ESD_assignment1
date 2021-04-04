//program to check if a given number is Fibonacci number or not.
class fibonacci{
public static void main(String args[]){
		int num = 12;
		int num1 = 4;
		int num2 = 7;
		int num3 = 6 ;
		while(num3 <= num){
	if(num3 == num){
		System.out.println("Number is fibonacci");
				return;
			}
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;		
		}
		System.out.println("Number is not fibonacci");
	}
}
