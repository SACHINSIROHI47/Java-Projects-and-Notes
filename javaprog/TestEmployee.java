import java.util.*;

class Employee 
{
	private String name;
	private double salary;
	private Date birthDate;
	public Employee(String n,double s,Date bd)
	{
		name = n;
		salary = s;
		birthDate = bd;
	}
	public String getDetails() 
	{
		return "Name: " + name + "\nSalary: " + salary+"\nBirth Date: " +birthDate;

	}
}
class Manager extends Employee 
{
	private String department;

	public Manager(String n,double s,Date bd,String dep)
	{
		super(n,s,bd);
		department = dep;
	}			
	public String getDetails()
 	{	
		// call parent method
		return super.getDetails()
	+ "\nDepartment: " + department;
	}
}
public class TestEmployee
{
	public static void main(String []args)
	{
		Date birthdate1 = new Date(07/25/1990);
		Employee obj = new Employee("Bill Gets",45000.00,birthdate1);
		System.out.println("Employee Details");
		System.out.println("-----------------------");
		System.out.println(obj.getDetails());
		System.out.println("-----------------------");

		Date birthdate2 = new Date(02/28/1990);
		Manager obj2 = new Manager("Mark Gets",95000.00,birthdate2,"Marketing");
		System.out.println("Manager Details");
		System.out.println("-----------------------");
		System.out.println(obj2.getDetails());
		System.out.println("-----------------------");

	}
}

	
