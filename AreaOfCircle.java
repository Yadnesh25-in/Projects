import java.util.Scanner;
class AreaOfCircle 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner (System.in) ;
		System.out.println("Enter a radius of circle : ");
		float radius = sc.nextFloat();
		
		float pi = 22.0f/7.0f;
		
		float formule = pi * (radius * radius);
		float perimeter  = 2 * (pi * radius) ;
		System.out.println("Perimeter of circle having radius "+ radius + " is: " +	perimeter + "cm");
		 
		System.out.println("Area of circle having radius "+ radius + " is: "+ formule + " cm^2");
			 
		
		
		
		
	}
}
