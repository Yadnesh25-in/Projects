import java.util.Scanner;
class  CharceterFinder
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter any Charecter : ");
		char ch = new Scanner(System.in).next().charAt(0);
		
		String cha=(ch>=65 && ch<=90 || ch>=97&& ch<=122)?
			((ch>='a'&& ch<='z')?(ch+" is a lowercase alphabet"):(ch+" is an Uppercase charecter")):
			((ch>='0' && ch<='9')?(ch+" is a digit"):
			(ch+" is a special charcter"));
		System.out.println(cha);
	}
}
