class CustomerAccount
{
	double principal, interestRate, time,amt;
	double amount() // Method that computes and returns amount.
	{
    		amt= (principal * interestRate*time)/100;
		return amt; //Returns the total amount .
	}	
  	void acctVal (double p, double r, double t) 
	{
     		principal = p;
		interestRate = r;
		time = t;    		
	}
}

class DisplayReturnAmount
{
	public static void main (String arr[])
	{
		double amount;
CustomerAccount cust1 = new CustomerAccount();            CustomerAccount cust2 = new CustomerAccount();
		cust1.acctVal(1000,5,2); // Initialize cust1.
		cust2.acctVal(20000,7,2); // Initialize cust2
		amount = cust1.amount(); 
// amount stores the data returned by the amount method
		System.out.println("The amount of first customer is:"+ amount);
           	amount = cust2.amount(); // Get the amount of second customer
		System.out.println("The amount of second customer is:"+ amount);
    	 }                                                                 
}
