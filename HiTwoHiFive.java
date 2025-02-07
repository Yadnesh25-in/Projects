import java.util.Scanner;
class  HiTwoHiFive
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter any Number : ");
		int num = new Scanner(System.in).nextInt();
		 
		String op = ((num%2==0 && num%5==0)?("HiTwoHiFive"):((num%2==0)?("HiTwo"):(num%5==0)?("HiFive"):("    ")));
		System.out.println(op);
	}
}	