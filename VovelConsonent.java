import java.util.Scanner;
class VovelConsonent 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a any alphabet: ");
		char ch = new Scanner(System.in).next().charAt(0);
		
		String op = (ch == 'a'|| ch == 'e'|| ch == 'i'||ch == 'o'||ch == 'u'||ch == 'A'|| ch == 'E'|| ch == 'I'||ch    == 'O'||ch == 'U')?(ch+" is a vovel"):(ch +" is a consonent");
		
		
		System.out.println(op);
	}
}
   