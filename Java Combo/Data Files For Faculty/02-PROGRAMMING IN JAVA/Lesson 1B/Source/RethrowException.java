class RethrowException
{
	static void throwDemo()
	{
		try
		{
			throw new NullPointerException ("My Exception");
		}			
		catch(NullPointerException e)
		{
			System.out.println("Exception caught in throwDemo() method");
			throw e; // Rethrow the Exception
	        }
	}
	public static void main(String args[])
	{
		try
		{
			throwDemo();
		}
		catch(NullPointerException e)			
		{
			System.out.println("Exception caught:" + e);
		}
	}
}

