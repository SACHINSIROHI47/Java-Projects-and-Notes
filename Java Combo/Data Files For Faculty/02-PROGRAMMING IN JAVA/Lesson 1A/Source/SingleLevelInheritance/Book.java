class Book //Declaration of the Superclass
{
//Declaring the data members.
String author= "Steve"; 
String title = "Handbook";
int price = 50;
int pages = 350;
int stock = 13;
//Defining the methods.
	public void show()
	{
		System.out.println(" ");
		System.out.println("\t Books Information");
		System.out.println("\t Book Author: " + author);
		System.out.println("\t Book Title: " + title);
		System.out.println("\t Book Price: " + price);
		System.out.println("\t Number of pages: " + pages);
		System.out.println("\t Book Stock: " + stock);
		System.out.println(" ");
	 }
}
