class UnreachableCodeDemo
 { 
	public static void main(String args[])
 	{
  		int num1=5, num2=0, num3;
  		try{
			num3=num1/num2;
		}
		catch(Exception e)
		{
			 System.out.println("Error"); 
		}
		catch(ArithmeticException e)
		{
System.out.println("Division by zero."); //Unreachable catch statement.
		}
					 
	}
}

