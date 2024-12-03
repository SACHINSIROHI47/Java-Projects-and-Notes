class Cplus extends SoftwareBook //Declaration of the Subclass
{
//Declaring the data members.
String author; 
String title;
//Defining the methods.
public void getData(String mauthor, String mtitle)	
	{
		author = mauthor;
		title = mtitle;
	}
	public void showData()
	{
show();
showDetails();
		System.out.println(" ");
		System.out.println("\t C++ Books Information");
		System.out.println("\t Author Name: " + author);
		System.out.println("\t Book Title: " + title);
		System.out.println(" ");
	}	
public static void main(String args[])
{
Cplus c = new Cplus();
c.get(45, 450); // Calling the get() method of the Book class.
// Calling the getDetails() method of the Software class.
c.getDetails("Borland C++", "5.0");
// Calling the getData() method of the Cplus class.
c.getData("Lee Mitchell", "Programming using C++");
c.showData(); 
	}
}
