//program to multiply two numbers using recursive multiplication.
class recursivemultiply  {
	double myproduct(double x, double y){
		if(y == 0){
			return 0;
		}
		else{
			return (x + myproduct(x, y - 1));
		}
		
	}
	public static void main(String args[]){
		double num1 = Double.parseDouble(args[0]);
		double num2 = Double.parseDouble(args[1]);
		recursivemultiply obj = new recursivemultiply ();
		System.out.println("product is : "+obj.myproduct(num1,num2));
	}
}