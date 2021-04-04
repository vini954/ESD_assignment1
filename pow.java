//Find the power of the number 
class pow{
	public static void main(String args[]){
		int power = 3 ;
		int base = 7
;
		int temp = base;
		while(power > 1){
			temp = temp * base;
			System.out.println(temp);
			power--;
		}
		System.out.println("Ans : " + temp);
	}
}