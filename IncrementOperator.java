class  IncrementOperator
{
	public static void main(String[] args) 
	{
		int poc = 100;
		
		System.out.println(poc++);			// 100
		System.out.println(poc++);			// 101d
		System.out.println(++poc);			// 103
		System.out.println(++poc);			// 104
		System.out.println(poc++);			// 104
		System.out.println(++poc);			// 106
		System.out.println(++poc+poc++);    // 214 
		System.out.println(++poc-poc++);    // 0
		System.out.println(++poc==poc++);   // true
		System.out.println(++poc>=poc++);   // true
		System.out.println(++poc<=poc++);   // true
	}
}
