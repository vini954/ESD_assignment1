// given number is harshad number or not
import java.util.Scanner;
public class harshadnumber{
	public static void main(String[] args) {
		int r,s=0,n,num;
		Scanner ob = new Scanner(System.in);
		System.out.printf("enter any number\n");
		n = ob.nextInt();
		num=n;
		while(n>9){
			while(n!=0){
				r=n%10;
				s=s+r;
				n=n/10; 
			}
			n=s;
		}
		if(num%s == 0)
			System.out.printf("given number is harshad number \n");
		else
			System.out.printf("Given number is not harshad number\n");
	}
}