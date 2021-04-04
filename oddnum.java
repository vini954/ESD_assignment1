// printing odd numbers between 0 to 100
class oddnum{
	public static void main(String[] args) {
	int i;
	System.out.println("the odd numbers between 0 to 100 is");
	for(i=0;i<100;i++)
	{
		if(i%2 == 0)
			System.out.println(i+1);
	}	
	}
}