import java.util.Scanner;
class MonthFinder 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter a month: ");
		String sc =new Scanner(System.in).next().toLowerCase();
		
		String op =((sc.equals("oct")|| sc.equals("nov") || sc.equals("dec") || sc.equals("jan"))?
			("its a winter month"):
			((sc.equals("feb")|| sc.equals("mar") || sc.equals ("apr") || sc.equals("may"))?
			("its  summer month"):
			(sc.equals("jun")|| sc.equals("jul") || sc.equals("aug") || sc.equals("sep")?
			("Its a mansoon months"):("INVALID MONTH"))));
		
		System.out.println(op);
	}
}
