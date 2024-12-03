class Fibonacci
{
	public static void main(String args[])
	{
		int num1 = 1, num2 = 1;
		System.out.println("The fibonacci series between 1 and 100:");
		System.out.println(num1);
		while (num2 < 100)
		{
		       if(num2 > 20 && num2 < 40)
			{
	//if the number in the fibonacci series is between 20 and 40, the following statement is displayed

 System.out.println("Continue statement found.");
		        num2 += num1; 
 num1 = num2 - num1; 
			 continue; //statements after continue are skipped
			}
System.out.println(num2);
		       num2 += num1; // adding the value of num1 to num2
num1 = num2 - num1; // reassigning num1 to the difference between num2 and num1
		}
	}
}
