package BankDet;

//Defining class
public class SamplePack  
{
String custname;
int acct_no;
int cust_id;

//Passing values in the constructor 'SamplePack'.
public SamplePack(String n1,int r1,int r2)
{
	custname=n1;
	acct_no=r1;
	cust_id=r2;
}
public void display()
{

System.out.println(); 
System.out.println("**********CUSTOMER INFORMATION**********");
System.out.println();
System.out.println();
System.out.println("  "+"Name of the Customer: "+custname);
System.out.println("  "+"Account Number :"+acct_no);
System.out.println("  "+"Customer ID:" +cust_id);
}
}
