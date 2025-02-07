class  TypecastingExample
{
	public static void main(String[] args) 
	{ //? double >....
		
		//double d = 123421434.123411234;
		//float f = (float)d;		//1.23421432E8
		//long l = (long)d;		//123421434
		//int i = (int)d;			//123421434
		//short s = (short)d;		//17146
		//byte b = (byte)d;		//-6
		//char c = (char)d;		//?
		
		//System.out.println(c);
		
		//??? float >.....
		
		float f = 78532342.1231731263f;
		//long l = (long)f;		//78532344
		//int i = (int)f;		//78532344
		short s = (short)f;	//7.8532344E7
		//byte b = (byte)f;		// -8
		//char c =(char)f;
		System.out.println(s);		//?
		
		
		//?long >> ...
		//long l = 1234371346;
		//int i = (int)l;		//1234371346
		//short s = (short)l;	//786
		//byte b = (byte)l;		// 18
		//char c =(char)l;		// ?
		//System.out.println(c);		//?
		
		
		
		//? int> ...
		
		//int i = 123456789;
		//short s = (short)i;		//-13035
		//byte b = (byte) i;		//21
		//char c = (char) i;			// ?
		//System.out.println(c);
		
		//short s = 29999;
		//byte b = (byte)s;		//47
		//char ch = (char)s;		// ?
		//System.out.println(ch);
		
		
		
		
	}
}
