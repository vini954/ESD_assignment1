public class speed{
	public static void main(String args[]){
		double distance = 400; // in meters
		int sec = 50;
		int min = 34;
		int hour = 1;
		
		double totalSec= (double)(sec + (min * 60) + ( hour * 60 * 60));
		double mps = distance/ totalSec;
		double kmph = 3.6 * mps;
		double mph = 2.23694 * mps;
		
		System.out.println("mps : "+mps+"  kmph : "+kmph+"  mph : "+mph); 
		
	}
}