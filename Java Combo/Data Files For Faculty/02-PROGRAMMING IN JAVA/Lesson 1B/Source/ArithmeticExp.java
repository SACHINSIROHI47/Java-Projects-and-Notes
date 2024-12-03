class ArithmeticExp
{
   public static void main(String args[]) 
   {
	int num1=0, num2=5,num3=0;
     try
	{
 		num3=num2/num1;
		System.out.println("The result=" + num3);
	}
	catch(ArithmeticException e)
	{
		System.out.println("Division by zero is performed");
	}
	
    }    
}
