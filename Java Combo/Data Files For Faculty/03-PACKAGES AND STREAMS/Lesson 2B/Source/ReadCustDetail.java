// ReadCustDetail.java
import java.io.*;
public class ReadCustDetail
{
	public static void main(String args[])
  	{
    		Account acc=new Account();
    		try
    		{
     			 FileInputStream fis=new FileInputStream("account.txt");
			 ObjectInputStream ois=new ObjectInputStream(fis);
		                 acc=(Account)ois.readObject();
			 acc.show();
	                }
		catch(IOException ioe)
       		{
       			  System.out.println("Exception: "+ioe.toString());
       		}
       		catch(ClassNotFoundException cnfe)
       		{
         			System.out.println("Exception: "+cnfe.toString());
       		}
  	}	//End of main()
}
