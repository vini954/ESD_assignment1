// area of trapezoid
import java.io.*;
public class trapezoidarea {
static double Area(int b1, int b2, int h)
    {
	 return ((b1 + b2) / 2) * h;
    }
 public static void main (String[] args)
    {
       	int base1 = 8, base2 = 10, height = 6;
        	double area = Area(base1, base2, height);
        	System.out.println("area of trapezium :  " + area);
    }
    }