import java.util.Scanner;
public class circlearea
{
public static void main(String[] args) 
    {
        int r;
        double pi = 3.14, Area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        Area = pi * r * r;
        System.out.println("Area of circle:"+Area);
    }            
}