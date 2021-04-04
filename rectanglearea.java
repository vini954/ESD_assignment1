// area of rectangle
import java.util.Scanner;
public class rectanglearea{
   public static void main (String[] args)
   {
	   Scanner scanner = new Scanner(System.in);
	   System.out.println("Enter Rectangle length :");
	   double length = scanner.nextDouble();
	   System.out.println("Enter Rectangle width :");
	   double width = scanner.nextDouble();
	   double area = length*width;
	   System.out.println("Rectangle area :"+area);
   }
}