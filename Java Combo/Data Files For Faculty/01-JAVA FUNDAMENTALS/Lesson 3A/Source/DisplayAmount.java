class CustAccount
{
	double principal, interestRate, time, amt;
	void amount() // Method that computes
	{
    		amt= (principal * interestRate*time)/100;
		System.out.println("The amount is:"+ amt);
	}	
  void acctVal (double p, double r, double t) 
// Defining the accVal method that accepts parameters
	{
     		principal = p;
		interestRate = r;
		time = t;    		
	}
}

class DisplayAmount
{
	public static void main (String arr[])
	{
		CustAccount cust1 = new CustAccount(); 
// Allocate memory for an object
             CustAccount cust2 = new CustAccount();
		cust1.acctVal(1000,5,2); 
		cust2.acctVal(20000,7,2); 
		cust1.amount(); // Get the amount of first customer
	       cust2.amount(); // Get the amount of second customer
        }                                                                 
}
