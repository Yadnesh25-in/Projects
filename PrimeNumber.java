import java.util.Scanner;

class PrimeNumber 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = sc.nextInt();
		
		System.out.println
			((num ==2 || num ==3 || num==5)? (num+ " is a prime"):
			((num%2==0||num%3==0 ||num%5==0)?
			(num+" is not prime"):(num+ " is  prime")));
	}
}
