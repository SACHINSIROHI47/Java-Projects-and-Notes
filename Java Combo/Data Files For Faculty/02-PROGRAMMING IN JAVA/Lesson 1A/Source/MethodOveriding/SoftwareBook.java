class SoftwareBook extends Book//Declaration of the Subclass
{
//Declaring the variables.
String softwareName = "Borland C++"; 
String softwareVersion = "5.0";
//overriding the show()method.
public void show()
{
	System.out.println(" ");
	System.out.println("\t Software Books Information");
System.out.println("\t Software Name: " + softwareName);
System.out.println("\t Software Version: " + softwareVersion);
	System.out.println(" ");
}	
	public static void main(String args[])
	{
	SoftwareBook s = new SoftwareBook();
	s.show();
	 }
}
