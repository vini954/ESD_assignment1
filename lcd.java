// Java Program to determine LCD of given numbers
public class lcd{
static int gcd(int a, int b){
        if (a == 0)
            return b;
              
        return gcd(b % a, a);
    }
static int lcm(int a, int b)
    {
        return (a * b) / gcd(a, b);
    }
static void printSum(int num1, int den1,
        int num2, int den2)
    {
   int lcd = lcm(den1, den2);
 
        num1 *= (lcd / den1); 
        num2 *= (lcd / den2); 
      
        int res_num = num1 + num2;
          
        System.out.print( res_num + "/" + lcd);
    }
          
    public static void main(String args[]) 
    {
          
        int num1 = 1, den1 = 6; 
        int num2 = 1, den2 = 7; 
  
        printSum(num1, den1, num2, den2);
    }
}