//WriteCustDetail.java

import java.io.*;
public class WriteCustDetail
{
	public static void main(String args[])
  	{
    		Account acc=new Account(1001,"Billy Zoe",40000.50);
		
    		try
    		{
      			FileOutputStream fos=new FileOutputStream("account.txt");
      			ObjectOutputStream oos=new ObjectOutputStream(fos);
      			oos.writeObject(acc);
      			oos.flush();
      			oos.close();
    		}
		catch(IOException ioe)
       		{
			 System.out.println("Exception: "+ioe.toString());
       		}
	  }	
}

