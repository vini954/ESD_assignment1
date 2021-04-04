import java.io.*;
public class circlelie{
static void circle(int x1, int y1, int x2, int y2, int r1, int r2) {
        int distSq = (int)Math.sqrt(((x1 - x2)* (x1 - x2))+ ((y1 - y2)* (y1 - y2)));
        if (distSq + r2 == r1)
        {
System.out.println("The smaller circle lies completely"+ " inside the bigger circle with "+ "touching each other "+ "at a point of circumference. ") ;
        }
                 
        else if (distSq + r2 < r1)
        {
            System.out.println("The smaller circle lies completely" + " inside the bigger circle without"+ " touching each other "+ "at a point of circumference.") ;
        }
                 
        else
        {
            System.out.println("The smaller does not lies inside" + " the bigger circle completely.") ;
        }
   }
public static void main (String[] args) {
        int x1 = 7, y1 = 10;
        int x2 = 3 , y2 = 2;
        int r1 = 30, r2 = 20;
        circle(x1, y1, x2, y2, r1, r2);
}
}