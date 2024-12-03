class Company
{
int totalEmployee = 100;
	void innerTest()
	{		
		HRClass HRC = new HRClass();
		HRC.display();
	}
	class HRClass // nested class
	{
		int HREmployee = 20;	
		void display()
		{
			System.out.println("The Employee strength of Global System,Inc. is:" + totalEmployee); 
// displaying data member of the enclosing class
			System.out.println("The Employee strength of HR Department of Global System,Inc. is:" + HREmployee);
		}
	}
}
class InnerClassDemo 
{
	public static void main(String args[])
	{
		Company GSI = new Company();
		GSI.innerTest();
	}
}
