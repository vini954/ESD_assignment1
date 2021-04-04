//program to get input and find the age.

public class findage{

	void age(int iq, int sh)
	{
		int charu = iq+sh-sh-12;
		System.out.println("Charu is 12 years younger than Iqbal");
		System.out.println("Charu's age is "+charu);
	}

	public static void main(String[] args) {
		
		findage obj = new findage();
		obj.age(14,11);
	}
}