class  ProductOfNumber  
{
	public static void main(String[] args) 
	{
		
		int num = 2345;
		int product = 1;
		int rem = num%10;
		product = product*rem;
		
		num = num/10;
		rem = num%10;
		product = product*rem;
		
		num = num/10;
		rem = num%10;
		product = product*rem;
			
		num = num/10;
		rem = num%10;
		product = product*rem;
			
			
		System.out.println(product);
	}
}
