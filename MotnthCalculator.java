class  EmiCalculator
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("	LOAN CALCULATOR");
		System.out.print();
		System.out.print("Enter the Amount : ");
		float amount = sc.nextFloat();
		System.out.print("Enter ROI : ");
		float roi = sc.nextFloat();
		System.out.print("Enter the tenure(months) : ");
		int months = sc.nextInt();
		// Convert months to Year 
		String str = (month/12)+"."+(month%12);
		float con = Float.parseFloat(str);
		
		System.out.println();
		System.out.println("LOAN CALCULATION");
		System.out.println("PRINCIPAL AMOUNT : "+amount);
		System.out.println("ROI : "+roi+"%");
		System.out.println("Tenure : "+month+ "months");
		
		float intYear = amount*roi/100;
		float totalInter = intYear*con;
		System.out.println("Interest : "+totalInter);
		float outStanding = amount+totalInter;
		System.out.println("Total OutStanding Amount : "+outStanding);
		System.out.println("EMI: "+ (outStanding/month)+""rs);
		

		
}
