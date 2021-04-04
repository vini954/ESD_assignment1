//program to find the square of the number. 
import java.util.*;
public class square{
public static void main(String args[]){
	Scanner V= new Scanner(System.in);
	int  num;
	System.out.println("enter the integer :");

	num= V.nextInt();
	System.out.println("Square of "+ num +" is : " +Math.pow(num,2));

}
}