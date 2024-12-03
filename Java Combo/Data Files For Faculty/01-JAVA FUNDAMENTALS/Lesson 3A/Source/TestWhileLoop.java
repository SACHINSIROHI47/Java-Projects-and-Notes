class TestWhileLoop
{
	public static void main(String args[])
	{
		int num1 = 1, num2 = 1;
		System.out.println("The fibonacci series between 1 and 100:");
		System.out.println(num1);
		while (num2 < 100)
		{
		       System.out.println(num2);
		       num2 += num1; // adding the value of num1 to num2
num1 = num2 - num1; // reassigning num1 to the difference between num2 and num1
		}
	}
}
