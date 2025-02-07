class  census 
{
	public static void main(String[] args) 
	{
		long currPopulation = 312032486;
		long secInYear  = (365*24*60*60)*5;
		long birthInSeconds = secInYear/7;
		long deathInSeconds = secInYear/13;
		long immigrantInSeconds = secInYear/25;
		
		long after5YearPopulation = (currPopulation+birthInSeconds-deathInSeconds+immigrantInSeconds);
		System.out.println("Population after 5 Years will be : " + after5YearPopulation);
		
	}
}
