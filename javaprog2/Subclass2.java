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
class TaxRate 
{
double Rate; 
}
class TaxService 
{
public TaxRate findTaxRate(Employee e) 
{
	// do calculations and return a tax rate for e
	TaxRate obj = new TaxRate();
	obj.Rate = e.salary*5/100;
	return obj;
}
}


public class Subclass2
{
	public static void main(String args[])
	{
		

		Manager m = new Manager();
		m.birthDate = new GregorianCalendar(1975,06,14);
		m.name="Sifora James";
		m.salary=50000.00;
		m.department="Marketing";

		// Meanwhile, elsewhere in the application class
		TaxService taxSvc = new TaxService();
		TaxRate t = taxSvc.findTaxRate(m);		
		System.out.println("Manager Details");
		System.out.println(m.getDetails());
		System.out.println("Tax Rate : "+t.Rate);
	}
}
		
