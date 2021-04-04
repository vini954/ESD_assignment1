// finding determinant of quadratic equations
import java.lang.Math;
import java.util.Scanner;
public class distance{
	public static void main(String []args){
	int x1,x2,y1,y2,z1,z2;double dist;	
	Scanner ob = new Scanner(System.in);
	System.out.printf("Enter location of first point in format (x1 y1 z1)\n");
	x1=ob.nextInt();
	y1=ob.nextInt();
	z1=ob.nextInt();
	System.out.printf("Enter location of third point in format (x2 y2 z2)\n");
	x2=ob.nextInt();
	y2=ob.nextInt();
	z2=ob.nextInt();
	dist=Math.sqrt(((x2-x1)*(x2-x1))+((y2-y1)*(y2-y1))+((z2-z1)*(z2-z1)));
	System.out.println("the euclidiean distance between the points  "+dist);
}
}