// given number is automorphic number or not
import java.util.Scanner;
class automorphic{
	public static void main(String[] args) {
		int n,k;
		System.out.printf("enter any number \n");
		Scanner ob = new Scanner(System.in);
		n = ob.nextInt();
		k=n*n;
		String num = Integer.toString(n);
		String sq=Integer.toString(k);
		if(sq.endsWith(num))
		{
			System.out.printf("given number is automorphic number");
			//System.out.println(num);
			//System.out.println(sq);
		} 
		else
		{
			System.out.printf("given number is not automorphic number");
		}
		}
	}