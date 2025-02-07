import java.util.Scanner;
class  FinancialApplication
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a bill : ");
		float bill = sc.nextFloat();
		
		System.out.println("Enter a tipRate rate in % : ");
		float tipRate = sc.nextFloat();
		
		float tipAmount = (tipRate*bill)/100;
		float totalBill = bill + tipAmount;
		
		System.out.println("The tip is :" + tipAmount+ "and total is "+totalBill);
		
		
	}
}
