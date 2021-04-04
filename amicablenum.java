// given numbers are amicable numbers or not
import java.util.Scanner;
class amicablenum{
	public static void main(String[] args) {
		int i,s1=0,s2=0,n1,n2,c=0;
		System.out.printf("enter any two numbers \n");
		Scanner ob = new Scanner(System.in);
		n1 = ob.nextInt();
		n2 = ob.nextInt();
		//k=n1;l=n2;
		//System.out.println(""+n1+","+n2);
		for(i=1;i<n1;i++)
		{
			if(n1%i == 0)
			{	s1 = s1+i;
			//System.out.println(s1);
			}
		}
		for(i=1;i<n2;i++)
		{
			if(n2%i == 0)
			{	s2= s2+i;
			//System.out.println(s2);
			}
		}
		if( s1 == n2 || s2 == n1 )
			System.out.printf("given numbers are ammicable numbers\n");
		else
			System.out.printf("given numbers are not ammicable numbers \n");
	}
}