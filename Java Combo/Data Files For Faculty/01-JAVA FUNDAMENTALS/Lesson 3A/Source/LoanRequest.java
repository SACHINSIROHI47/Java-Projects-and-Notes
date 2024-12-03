class LoanRequest
{
	public static void main(String args[])
	{
		boolean preLoanRequest = false;
		double LoanAmount = 4000;
		if((!(preLoanRequest)) && (LoanAmount < 5000))
{ // The NOT operator evaluates the boolean false value of the preLoanRequest data member value to true
			System.out.println("Loan can be offered.");
		}
		else
		{
			System.out.println("No Loan is offered.");
		}
	}
}
