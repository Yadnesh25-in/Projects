import java.util.Scanner;

class  AreaOfRectangle
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a height of rectangle: ");
		float height = sc.nextFloat();
		System.out.println("Enter a weidth of rectangle: ");
		

		float width = sc.nextFloat();
		
		float formula = height * width;
		float perimeter = 2 * (height + width);
		
		System.out.println("Area of rechangle is : " + formula);
		System.out.println("Perimeter of rechangle is : " + perimeter);
	}
}
