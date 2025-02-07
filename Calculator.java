import java.util.Scanner;
class Calculator 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter num1 : ");
		float num1 = new Scanner(System.in).nextFloat();
		
		System.out.println("Enter num2 : ");
		float num2 = new Scanner(System.in).nextFloat();
		
		System.out.println("Enter operator : ");
		char op = new Scanner(System.in).next().charAt(0);
		
		float opt = 0;	
		opt =(op == '+')? (num1 + num2):
			(op == '-')? (num1 - num2):
			(op == '*')? (num1 * num2):
			(op == '/')? (num1 / num2):
			(op == '%')? (num1 % num2):0.00001f;
		
		System.out.println(num1+ " "+ op +" " +num2+""+ '=' +" "+opt);
		
		if(!(opt==0.00001f))
			{
			
			System.out.println(opt);
			}
		
		
		System.out.println("INVALID OPERANT");	
	}
}
