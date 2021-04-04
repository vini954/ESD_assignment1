//program to compute body mass index (BMI).

class BMI{
	public static void main(String args[]){
		double weight = 108; //weight in kgs
		double height = 157; //height in meters
		double bmi = weight/(height * height);
		System.out.println("BMI : "+bmi);
	}
}