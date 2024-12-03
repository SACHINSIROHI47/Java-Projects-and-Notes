class RefObject 
{
	String Name;
}
class Test
{
		void Calling()
		{
			RefObject RO = new RefObject();
			RO.Name= "Original";
			System.out.println("The value of variable, Name, is:" + RO.Name);
			Called(RO);
			System.out.println("The value of variable, Name, after change in Called method is:" + RO.Name);
		}
		void Called(RefObject RefObj) 
//Method is using call by reference.
		{
			RefObj.Name = "Changed";
		}
}
class PassByRefTest
{
	public static void main(String args[])
	{
		Test t =new Test();
		t.Calling();
	}
}
