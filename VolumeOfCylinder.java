import java.util.Scanner;
class VolumeOfCylinder 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a radius of a cylinder : ");
		float radius = sc.nextFloat();
		
		System.out.println("Enter a lengh of a cylinder : ");
		float length = sc.nextFloat(); 
		
		float pi = 22.0f/7.0f;
		
		float area = pi * (radius*radius);
		float volume = area * length;
		
		System.out.println("Area of cylinder is : " + area);
		System.out.println("Area of cylinder is : " + volume);
		
	}
}
