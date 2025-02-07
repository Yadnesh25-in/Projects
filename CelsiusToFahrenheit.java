import java.util.Scanner;
class  CelsiusToFahrenheit
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a temperature in celsius : ");
		double celsius = sc.nextDouble();
		
		
		
		double conversion = (9.0/5.0)*celsius+32.0;
		
		System.out.println("Conversion of "+celsius+ "to fahrenheit is : "+ conversion);
	}
}
