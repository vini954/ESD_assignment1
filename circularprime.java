// program to check if a given number is circular prime or not.
public class circularprime{
	static boolean isPrime(int num){
		int i;
		for(i = 2; i < num; i++){
			if((num % i) == 0){
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]){
		int num = 1931;
		int length = String.valueOf(num).length();
		int mask = 1, i;
		int digit;
		for( i = 0; i < length - 1 ; i++){
			mask = mask * 10;
		}
		
		for(i = 0; i < length; i++){
			digit = num % 10;
			num = num / 10;
			
			num = (digit * mask) + num;
			
			if(!(isPrime(num))){
				System.out.println("Number is not circular prime");
				return;
			}
		}
		System.out.println("Number is circular prime");
	}
}
