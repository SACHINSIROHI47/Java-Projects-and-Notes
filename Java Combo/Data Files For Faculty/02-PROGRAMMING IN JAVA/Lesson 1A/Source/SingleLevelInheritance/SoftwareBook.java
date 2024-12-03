class SoftwareBook extends Book//Declaration of the Subclass
{
//Declaring the data members.
String softwareName = "Windows"; 
String softwareVersion = "Mary Peterson";
//Definition of method
	public void showDetails()
	{
		show();//Calling the method of Book class.
		System.out.println("\t Software Books Information");
		System.out.println("\t Software Name: " + softwareName);
System.out.println("\t Software Version: " + softwareVersion);
		System.out.println(" ");
	}	
public static void main(String args[])
{
HardwareBook h = new HardwareBook();
SoftwareBook s = new SoftwareBook();
s.showDetails();
h.showData();
}
}
