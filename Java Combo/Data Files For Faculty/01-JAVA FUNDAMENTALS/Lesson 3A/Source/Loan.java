class Loan
{
	public static void main(String args[])
	{
		double LoanRequest = 4000;
		int nOfYear = 6;
		if((LoanRequest < 5000) || (nOfYear < 5))
		{
			System.out.println("Loan can be offered.");
		}
		else
		{
			System.out.println("No Loan is offered.");
		}
	}
}
