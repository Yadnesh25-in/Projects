import java.util.Scanner;
class  PoundsToKilograms
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total Weight in pounds : ");
		float totalPounds = sc.nextFloat();
		
		float poundsInKg = 0.454f;
		
		float poundsIntoKilograms = totalPounds * poundsInKg;
		System.out.println(totalPounds+" pounds is "+poundsIntoKilograms+ " kilograms");
		
		
		
		
	}
}