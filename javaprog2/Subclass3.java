import java.util.Calendar;
import java.util.GregorianCalendar;

class Employee 
{
	public String name;
	public double salary;
	public Calendar birthDate;
	public String getDetails() 
	{
		return "Name: " + name + "\nSalary: " + salary+"\nBirth Date: "+birthDate.get(Calendar.DAY_OF_MONTH)+"/"+birthDate.get(Calendar.MONTH)+"/"+birthDate.get(Calendar.YEAR);
	}
}
class Manager extends Employee
{
	public String department;
	public String getDetails() 
	{
		// call parent method
		return super.getDetails()+ "\nDepartment: " + department;
	}
}

public class Subclass3
{
	public static void main(String args[])
	{
		Employee m = new Manager();
		m.birthDate = new GregorianCalendar(1975,06,14);
		m.name="Sifora James";
		m.salary=50000.00;
		m.department="Marketing";
		
		if(m instanceof Employee)
		{
			System.out.println("Employee Details");
		}
		else if(m instanceof Manager)
		{	
			System.out.println("Manager Details");			
		}
		else
		{
			System.out.println("Other class Details");
		}
		System.out.println(m.getDetails());
	}
}




		
