// given number is cube or not
import java.util.Scanner;
class cubeornot{
	public static void main(String[] args) {
		int i,n1,c=0,k;
		System.out.printf("enter any number \n");
		Scanner ob = new Scanner(System.in);
		n1 = ob.nextInt();
		/*for(c=0;c<4;c++)
		{
			n1 = n1/3;
		}*/
		for(i=0;i<n1;i++)
		{
			k = i*i*i;
			if(k == n1)
				c++;
		}
		if(c == 1)
		{
			System.out.printf("given number is perfect cube\n ");

		}
		else 
			System.out.printf("given number is not a perfect cube\n");
	}
}