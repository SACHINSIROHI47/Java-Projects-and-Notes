import java.io.*;

public class TestFileReader
{
	public static void main(String args[])
	{
    		try
    		{
      			File file=new File("Name.txt");
		       FileReader f=new FileReader(file);
			int ch;
      			while((ch=f.read())!=-1)	//Loop till end of file.
      			{
        			System.out.print((char)ch);
      			}
	    	}
		catch(FileNotFoundException fnfe)
       	{
			System.out.println("Exception: "+fnfe.toString());
       	}
       	catch(IOException ioe)
       	{
			System.out.println("Exception: "+ioe.toString());	 
        	}
  	}	//End of main()
}