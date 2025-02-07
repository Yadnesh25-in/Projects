import java.util.Scanner;
class PercentageFinder 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Your Marks : ");
		float perc = new Scanner(System.in).nextFloat();
		
		float percentage = (perc/600)*100;
		
		if (100>=percentage && percentage>=35);
		{
			System.out.println("You are passed in exams");
		}
		
		//System.out.println(str);
		System.out.println("You are failed in exams");
		
	}
}
s