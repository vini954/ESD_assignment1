// mean og given 5 numbers
import java.util.Scanner;
class mean{
	public static void main(String[] args) {
		int n1,n2,n3,n4,n5;
		float mean;
		Scanner ob = new Scanner(System.in);
		System.out.printf("enter 5 numbers \n");
		n1=ob.nextInt();
		n2=ob.nextInt();
		n3=ob.nextInt();
		n4=ob.nextInt();
		n5=ob.nextInt(); 
		mean=((n1+n2+n3+n4+n5)/(float)5);
		System.out.printf("the mean of given numbers :%f \n",mean);
	}
}