import java.util.Scanner;
class  UppercaseFinder
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter any Charecter : ");
		char ch = new Scanner(System.in).next().charAt(0);
		
		String cha=(ch>=65 && ch<=90)?("is a uppercase Charecter"):("is not a uppercase charecter");
		System.out.println(cha);
	}
}
