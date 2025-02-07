import java.util.Scanner;
class BMICalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you Weight in pounds : ");
		float weight = sc.nextFloat();
		
		System.out.println("Enter you height in inchs : ");
		float height = sc.nextFloat();
		
		final float poundsInKG = 0.45359237f;
		final float oneinch = 0.0254f;
		
		float bmi =(weight*poundsInKG)/((height*oneinch)*((height*oneinch)));
		System.out.println( "Your BMI is : " + bmi);
	}
}
