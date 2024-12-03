class PassByValue 
{
	void Calling()
		{
			int value =5;
			System.out.println("The value of variable is:" + value);
			Called(value); // Actual parameters.
			System.out.println("The value of variable after change in Called method is:" + value);
		}
	void Called(int passedValue) // Formal parameters
		{
			passedValue = 10;
		}
}
class PassByValueTest
{
	public static void main(String args[])
	{
		PassByValue t =new PassByValue();
		t.Calling();
	}
}	
