//Account.java
import java.io.*;

public class Account implements Serializable
{
	 private int Acc_No;
	 private String Customer_Name;
	 private double Balance_Amount;
	public Account()
	{
	}

	 public Account(int no,String name,double amt)
  	{
    		Acc_No=no;
             		Customer_Name=name;
	      	Balance_Amount=amt;
  	}
	public void show()
  	{
	 	System.out.println("Account Number: "+Acc_No);
	 	System.out.println("Customer Name: "+Customer_Name);
		System.out.println("Balance Amount: "+Balance_Amount);
  	}

  	
}


