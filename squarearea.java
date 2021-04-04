import java.util.Scanner;
public class squarearea{
public static void main (String[] args) {
       System.out.println("Enter side of square :");
       Scanner scanner = new Scanner(System.in);
       double side = scanner.nextDouble();
       double ar = side*side; 
       System.out.println("area of square : "+ar);
   }
}