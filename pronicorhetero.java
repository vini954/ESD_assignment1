//given number is pronic or heteromecic number
import java.util.Scanner;
class pronicorhetero{
	public static void main(String[] args) {
		int n,i,c=0;
		System.out.printf("enter any number \n");
		Scanner ob = new Scanner(System.in);
		n = ob.nextInt(); 
		for(i=0;i<n;i++){
			if(n == i*(i+1))
				c=1;
			}
				if(c == 1)
				System.out.printf("given number is pronic or Heteromecic number \n");
			else
				System.out.printf("Given number is not pronic or Hetromecic number\n");
	}
}