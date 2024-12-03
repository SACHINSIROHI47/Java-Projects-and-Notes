import java.util.Date;

class DateClass
{
	public static void main(String args[])
	{
		Date date = new Date();
		System.out.println("The current date and time are: " + date);
		long ms = date.getTime();
		System.out.println("The number of milliseconds elapsed since Jan 1 1970 are " + ms);
	}
}
