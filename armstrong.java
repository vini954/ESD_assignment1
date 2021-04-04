public class armstrong{
public static void main(String args[]){
//System.out.println("enter the number : ");
int number = 153 , Num , r, res=0;
Num = number;
while (Num !=0)

	{
	    r = Num % 10;
	    res += Math.pow(r , 3);
	    Num /= 10;
	}
if(res == number)
     System.out.println(number + " It's a Armstrong number");
else
     System.out.println(number + " It's not a Armstrong number");
}
}
