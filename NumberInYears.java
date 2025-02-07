import java.util.Scanner;
class  NumberInYears
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total no. of mins : ");
		int totalMins = sc.nextInt();
		
		final int minutuesInYear= 365*24*60;
		final int minutesInDay = 24*60;
		
		long years = totalMins / minutuesInYear;
		long remMins = totalMins % minutuesInYear;
		long days = remMins / minutesInDay;
		
		
		
		System.out.println( totalMins  +   " minutes is approxiately " +  years  +   "  years and " +days  + "days"  );
		
	}
}
