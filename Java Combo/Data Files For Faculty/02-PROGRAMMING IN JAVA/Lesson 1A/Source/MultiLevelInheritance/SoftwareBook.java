class SoftwareBook extends Book//Defining the subclass.
{
//Declaring the data members.
String softwareName; 
String softwareVersion;
//Defining the methods.
public void getDetails(String msoftwareName, String msoftwareVersion)	{
		softwareName = msoftwareName;
		softwareVersion = msoftwareVersion;
	}
	public void showDetails()
	{
		System.out.println(" ");
		System.out.println("\t Software Books Information");
		System.out.println("\t Software Name: " + softwareName);
		System.out.println("\t Software Version: " + softwareVersion);
		System.out.println(" ");
	}	
	 }
