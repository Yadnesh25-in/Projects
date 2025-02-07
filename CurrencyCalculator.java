import java.util.Scanner;
class CurrencyCalculator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("	Currency  Calculator	");
		System.out.println();
		System.out.print("Enter the amount(INR): ");
		float inr = sc.nextFloat();
		
		
		System.out.println("LIST OF CURRENCY");
		System.out.println("1.USD");
		System.out.println("2.EUR");
		System.out.println("3.GBP");
		System.out.println("4.PKR");
		System.out.println("5.DHRM");
		System.out.println("6.YEN");
		System.out.println();
		String curr = sc.next().toUpperCase();
		
		
		float conCurr = 0;
		
		if (curr.equals("USD"))
		{
			conCurr = inr/86.56f;
			System.out.println(inr+" INR = "+conCurr+ "USD");
		}
		
		else if (curr.equals("EUR"))
		{
			conCurr = inr/90.25f;
			System.out.println(inr+" INR = "+conCurr+ "EUR");
		}
		
		else if (curr.equals("GBP"))
		{
			
			conCurr = inr/107.65f;
			System.out.println(inr+" INR = "+conCurr+ "GBP");
		}	
		
		else if (curr.equals("PKR"))
		{
			conCurr = inr/0.31f;
			System.out.println(inr+" INR = "+conCurr+ "PKR");
		}	
		
		else if (curr.equals("DHRM"))
		{
			conCurr = inr/23.56f;
			System.out.println(inr+" INR = "+conCurr+ "DHRM");
		}	
		
		else if (curr.equals("YEN"))
		{
			conCurr = inr/0.55f;
			System.out.println(inr+" INR = "+conCurr+ "YEN");
			
		}	
		
		else{
			System.out.println("INVALID INPUT");
		}
		
		
		
		
	}
}
