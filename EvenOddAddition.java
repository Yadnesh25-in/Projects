class  EvenOddAddition
{
	public static void main(String[] args) 
	{
		int num = 2323;
		int even = 0;
		int odd = 0;
		
		int rem = num%10;
		int sum = (rem%10==0)?(even=even+rem):(odd=odd+rem);

		num = num/10;
		rem = num%10;
		sum = (rem%2==0)?(even= even+rem):(odd=odd+rem);
		
		num = num/10;
		rem = num%10;
		sum = (rem%2==0)?(even=even+rem):(odd=odd+rem);
		
		num = num/10;
		rem = num%10;
		sum = (rem%2==0)?(even=even+rem):(odd=odd+rem);
		
		System.out.println("Even sum is "+even);
		System.out.println("Even odd is "+odd);
		
		
		
		
		
		
	}
}
