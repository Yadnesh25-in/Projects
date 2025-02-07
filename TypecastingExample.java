class  TypecastingExample
{
	public static void main(String[] args) 
	{ //? byte <....
		byte a = 10;
		//short b = a;
		//int c = a;
		//long l = a;
		//float d = a;
		//double e = a;
		//char r = a; lossy conversion from byte to char
		//System.out.println(r);
		
		//? short < .....
		short b = 20;
		//int c = b;
		//long l = b;
		//float f = b;
		//double d = b;
		//char r = b; lossy conversion from short to char
		//System.out.println(r);
		
		//? int< ...
		int i = 1000;
		//long l = i;
		//float f  = i;
		//double d = i;
		//System.out.println(c);
		
		//? long< ...
		long l = 179392573;
		//float f = l;
		//double d = l;
		//System.out.println(d);
		
		
		//? float< ...
		float f = 123456789.0f;
		//double d = f;
		//System.out.println(d);
		
		//? char<...
		char c = 'z';
		//short s = c;  possible lossy conversion from char to short
		//int j = c;       122
		//long t = c;		   122	
		//float x =c;	 122.0
		//double g = c; 122.0	
		//System.out.println(g);
	}
}
