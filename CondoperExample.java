import java.util.Scanner;
class  CondoperExample    // find the biggest no.amoung this
{
	public static void main(String[] args) 
	{
		
		int a = 22;
		int b = 45;
		int c = 56;
		int lar = (a>b) ? ((a>c)?(a):(b)) : ((b>c)?(b):(c));
		
		
		System.out.println(lar);
	}
}
