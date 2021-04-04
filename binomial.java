//program for the binomial coefficient of two numbers
import java.util.Scanner;
class binomial{
	static int fact(int n){
		int c=1,i;
		for(i=1;i<=n;i++){
			c=c*i;
		}
		return c;
	}
	public static void main(String[] args) {
		int n,r,nr,dr,binomial;
		Scanner ob = new Scanner(System.in);
		System.out.printf("enter the two numbers : ");
		n = ob.nextInt();
		r = ob.nextInt();
		nr=fact(n);
		dr=fact(n-r)*fact(r);
		binomial=nr/dr;
		System.out.printf("the binomial coefficient of two numbers : %d", binomial);	
	}
}