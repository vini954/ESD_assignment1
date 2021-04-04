 public class pellseries{

    public static void main(String args[])
    {
	int n,a=1,b=0,e;
    System.out.println("First 15 Pell numbers: ");
    for(n=1; n<=15; n++)
     {
      e= a + 2*b;
      System.out.print(e+" ");
      a = b;
      b = e;
     }
   }
 }