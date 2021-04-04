// given number is duck number or not
import java.util.Scanner;
class ducknum{
	public static void main(String[] args) {
		int s,n,c=0;
		System.out.printf("enter any number \n");
		Scanner ob = new Scanner(System.in);
		n = ob.nextInt();
		while(n>0){
			s=n%10;
			if(s==0){
				c++;
			}
			n=n/10;
	}
	if(c>0)
		System.out.printf("given number is duck number\n");
	else
		System.out.printf("given number is not a duck number\n");
}
}
