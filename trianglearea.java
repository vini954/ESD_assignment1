import java.util.Scanner;
public class trianglearea {
   public static void main(String args[]) {   
      Scanner scanner = new Scanner(System.in);
      System.out.println("Enter the width of the Triangle:");
      double b = scanner.nextDouble();
      System.out.println("Enter the height of the Triangle:");
      double h = scanner.nextDouble();
      double area = (b * h)/2;
      System.out.println("Triangle area : " + area);      
   }
}