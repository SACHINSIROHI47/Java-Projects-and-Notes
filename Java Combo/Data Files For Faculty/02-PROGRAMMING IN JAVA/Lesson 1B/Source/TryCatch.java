public class TryCatch
{
public static void main(String args[])
   	{       
		int array[] = {0,0};
       	int num1, num2, result = 0;
       	num1 = 100;
	    	num2 = 0;
       	try
       	{
			result = num1/num2;
			System.out.println(num1 / array[2]);
			//more statements
       	}
       	catch(ArithmeticException e)
       	{
            	System.out.println("Error... Division by zero");
       	}
	    	catch(ArrayIndexOutOfBoundsException e)
       	{
            	System.out.println("Error... Out of bounds");
       	}
	    	catch (Exception e)
	    	{
			System.out.println("Some other error");
	    	}
       	System.out.println("The result is: " + result); 
//program proceeds
    	}
}
