class ClassA{
	int i,j;
}
class ClassB
{
	int m,n;
}

class TestInstanceOf
{
	public static void main(String args[])
	{
		ClassA A = new ClassA();
		ClassB B = new ClassB();
	
		if(A instanceof ClassA) // instanceOf operator
		{
			System.out.println("A is an instance of class ClassA.");
		}
		else
		{
			System.out.println("A is not an instance of class ClassA.");
		}
		if(B instanceof ClassB)
		{
			System.out.println("B is an instance of class ClassB.");
		}
		else
		{
			System.out.println("B is not an instance of class ClassB.");
		}
	}
}

