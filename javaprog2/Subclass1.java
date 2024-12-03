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
public class Subclass1
{
	public static void main(String args[])
	{
		Employee obj1 = new Employee();
		obj1.birthDate = new GregorianCalendar(1990,10,25);
		obj1.name="Bharti Sharma";
		obj1.salary=25000.00;
		System.out.println("Employee Details");
		System.out.println(obj1.getDetails());

		Manager obj2 = new Manager();
		obj2.birthDate = new GregorianCalendar(1975,06,14);
		obj2.name="Sifora James";
		obj2.salary=50000.00;
		obj2.department="Marketing";
		System.out.println("Manager Details");
		System.out.println(obj2.getDetails());
	}
}
		
