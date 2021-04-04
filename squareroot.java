//program to find the square root of the number. (import MATH,can use sqrt) 
import java.util.Scanner;
public class squareroot{
public static void main(String[] args) {
        Double num;
        Scanner sr= new Scanner(System.in);
 
        System.out.print("Enter a number: ");
        num = sr.nextDouble();
         
        Double squareroot = Math.pow(num, 0.5);
        System.out.println("The Square of a Given Number  " + num + "  =  " + squareroot);
    }
}