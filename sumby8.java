// program to find the number between 0 - 1000 where the sum is 8.
public class sumby8{
	public static void main(String[] args) {
		int num, i,n1=0, n2=0,n3=0,j;
	System.out.println("The sum of digits 8 between 0 to 1000  :  ");
		for( i=0; i<=1000; i++){
			num=i;
			j=i;
				n1=j%10;
				    j =j/10;
				n2 =j%10;
				j=j/10;
				n3=j%10;
				 
				
			if(n1+n2+n3== 8)
				System.out.println(num);
		}
	}
}