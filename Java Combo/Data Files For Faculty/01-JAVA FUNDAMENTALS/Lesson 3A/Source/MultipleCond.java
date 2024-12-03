class MultipleCond
{
	public static void main(String args[])
	{
		double balance = 12000;
		if((balance != 0) && (balance < 5000))
		{
			System.out.println("Interest rate offered is 2%.");
		}
		else if((balance >= 5000) && (balance < 10000))

		{
			System.out.println("Interest rate offered is 4%.");
		}
		else if((balance >= 10000) && (balance < 15000))

		{
			System.out.println("Interest rate offered is 7%.");
		}
		else
		{
		System.out.println("Interest rate offered is 10%.");
		}
	}
}
