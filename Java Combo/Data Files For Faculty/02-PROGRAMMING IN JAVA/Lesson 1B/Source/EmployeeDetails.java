class Employee
{
	String empName;
	int empID;
	int empAge;

	public void displayEmpDetails()
	{
		System.out.println(empName);
		System.out.println(empID);
		System.out.println(empAge);
	}
}
public class EmployeeDetails
{
	Employee empObjects[];
	public EmployeeDetails()
	{
		empObjects = new Employee[3];
		for(int i=0;i!=3;i++)	
		{
			empObjects[i] = new Employee();
		}
		try
		{
			empObjects[0].empName = "John" ;
			empObjects[0].empID = 1 ;		
			empObjects[0].empAge = 24 ;
			empObjects[1].empName = "John" ;
			empObjects[1].empID = 1 ;
			empObjects[1].empAge = 24 ;
			empObjects[2].empName = "Smith" ;
			empObjects[2].empID = 2;
			empObjects[2].empAge = 35 ;
			empObjects[3].empName = "Joy" ;
			empObjects[3].empAge = 3 ;
			empObjects[3].empAge = 21 ;
		}
		catch(Exception e)
			{
				System.out.println("Duplicate Records Are Entered ........");	
			}
		
	}
	
		public void displayDetails()
		{
			for(int i =0; i!=3; i++ )
			{
				empObjects[i].displayEmpDetails();
			}
			
		}
	public static void main(String args[])
	{
		EmployeeDetails empObj;
		empObj = new EmployeeDetails();
		empObj.displayDetails();
	}
}
