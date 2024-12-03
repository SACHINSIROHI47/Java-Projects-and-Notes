class MyDate 
{
	private int day = 1;
	private int month = 1;
	private int year = 2000;

 	public MyDate(int day, int month, int year) 
	{
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public MyDate(MyDate date) 
	{
		this.day = date.day;
		this.month = date.month;
		this.year = date.year;
 	}
	public MyDate addDays(int moreDays) 
	{
		MyDate newDate = new MyDate(this);
		newDate.day = newDate.day + moreDays;
		// Not Yet Implemented: wrap around code...
		return newDate;
	}
	public String toString() 
	{
		return "" + day + "-" + month + "-" + year;
	}
}

 public class PassTest2 
{

	public static void main(String args[]) 
	{
		MyDate date1,date2,date3;
		
		// Assign the date
		date1 = new MyDate(22, 7, 1964);
		System.out.println("MyDate1: " + date1);
		
		// Assign the date
		date2 = new MyDate(date1);
		System.out.println("MyDate2: " + date2);

		date3=date2.addDays(5); 
		// What is the current value?
		System.out.println("MyDate3: " + date3);
	}
}


