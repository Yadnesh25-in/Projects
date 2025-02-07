import java.util.Scanner;
class PercentageFinder 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter Your Marks : ");
		float perc = new Scanner(System.in).nextFloat();
		
		float percentage = (perc/600)*100;
		
		String str = (percentage>=35)?("You are pass is exams"):("You are fail in exams");
		String str1 = (percentage>=75)?("You hav got 'A'grade"):(percentage>=60 && percentage<=27)?("You have got 'B'Grade"):(percentage>=35 && percentage<=60)?("You have got 'C'grade"):("You are fail in exams");
		
		System.out.println(str);
		System.out.println(str1);
		
	}
}
