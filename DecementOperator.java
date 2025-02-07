class  DecementOperator
{
	public static void main(String[] args) 
	{
		int doc = 100;
		
		System.out.println(doc--);      // 100
		System.out.println(doc--);      // 99
		System.out.println(--doc);      // 97
		System.out.println(--doc);      // 96
		System.out.println(doc--);      // 96
		System.out.println(--doc);      // 94
		System.out.println(--doc+doc--);      // 186 
		System.out.println(--doc-doc--);      // 0
		System.out.println(--doc==doc--);      // true
		System.out.println(--doc>=doc--);      // true
		System.out.println(--doc<=doc--);      // ture
	}
}
