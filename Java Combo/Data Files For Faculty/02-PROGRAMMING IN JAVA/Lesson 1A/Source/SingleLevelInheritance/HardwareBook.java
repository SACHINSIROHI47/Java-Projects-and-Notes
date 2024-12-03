class HardwareBook extends Book//Declaration of the Subclass
{
//Declaring the data members.
String hardwareTitle = "Printers";
String publisher = "Tom Wilkins";
//Defining the method, showData()
	public void showData()
	{
		System.out.println(" ");
		System.out.println("\t Hardware Books Information");
		System.out.println("\t Hardware Title: " + hardwareTitle);
		System.out.println("\t Publisher Name: " + publisher);
		System.out.println(" ");
}
}
