import java.util.Calendar;
import java.util.GregorianCalendar;

class Object 
{
	public Object() 
	{
		System.out.println("Welcome To SBI");	
	}
}
class Employee extends Object
{
	String name;
	double salary = 15000.00;
	Calendar birthDate;

	public Employee(String n, Calendar DB) 
	{
		super();
		name = n;
		birthDate = DB;
	}
	public Employee(String n) 
	{
		this(n, new GregorianCalendar(1990,01,01));
	}
	public String getDetails() 
	{
		return "Name: " + name + "\nSalary: " + salary+"\nBirth Date: "+birthDate.get(Calendar.DAY_OF_MONTH)+"/"+birthDate.get(Calendar.MONTH)+"/"+birthDate.get(Calendar.YEAR);
	}
}
class Manager extends Employee
{
	String department;

	public Manager(String n,Calendar DB,String dep) 
	{
		super(n,DB);
		department = dep;
	}
	public String getDetails() 
	{
		// call parent method
		return super.getDetails()+ "\nDepartment: " + department;
	}
}
public class ConstructorOverload
{
	public static void main(String args[])
	{
		Calendar BDate1 = new GregorianCalendar(1988,11,26 );
		Employee obj1 = new Employee("Aimee Verkoyen" ,BDate1);
		System.out.println("Employee1 Details");
		System.out.println("------------------------");
		System.out.println(obj1.getDetails());

		Employee obj2 = new Employee("Bharti Sharma");
		System.out.println("Employee2 Details");
		System.out.println("------------------------");
		System.out.println(obj2.getDetails());

		Calendar BDate2 = new GregorianCalendar(1975,6,14);
		Manager obj3 = new Manager("Sifora James",BDate2,"Marketing");
		System.out.println("Manager Details");
		System.out.println("------------------------");
		System.out.println(obj3.getDetails());
	}
}
