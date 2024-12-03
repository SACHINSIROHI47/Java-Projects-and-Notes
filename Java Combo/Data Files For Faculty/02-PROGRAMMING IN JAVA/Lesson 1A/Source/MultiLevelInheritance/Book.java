class Book 
{
//Declaring the data members.
int price;
int pages;
//Defining the get() method.
public void get(int mprice, int mpages)	
	{
		price = mprice;
		pages = mpages;
	}
	public void show()
	{
		System.out.println(" ");
		System.out.println("\t Books Information");
		System.out.println("\t Book Price: " + price);
		System.out.println("\t Number of pages: " + pages);
		System.out.println(" ");
		
	 }
}
