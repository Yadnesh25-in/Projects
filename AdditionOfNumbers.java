class AdditionOfNumbers 
{
	public static void main(String[] args) 
	{
		int num = 2456;
		int rem = num%10;
		int sum = 0;
		sum = sum + rem;
		
		num =num/10;
		
		rem = num %10;
		sum = sum+rem;
		num = num/10;
		
		rem = num%10;
		sum = sum+rem;
		num = num/10;
		rem = num%10;
		sum = sum+rem;
	
		System.out.println(sum);
	}
}
