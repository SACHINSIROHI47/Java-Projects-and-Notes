import java.util.Calendar;
class CalendarClass
{
	public static void main(String args[])
	{
		String months[]= {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
		Calendar cal = Calendar.getInstance();
		System.out.println("The Date is: ");
		System.out.print(months[cal.get(Calendar.MONTH)]);
		System.out.print(" " + cal.get(Calendar.DATE) + " ");
		System.out.println(cal.get(Calendar.YEAR));

		cal.set(Calendar.HOUR, 10);
		cal.set(Calendar.MINUTE, 27);
		cal.set(Calendar.SECOND, 0);

		System.out.print("Time is: ");
		System.out.print(cal.get(Calendar.HOUR) + ":");
		System.out.print(cal.get(Calendar.MINUTE) + ":");
		System.out.print(cal.get(Calendar.SECOND));
	}
}
