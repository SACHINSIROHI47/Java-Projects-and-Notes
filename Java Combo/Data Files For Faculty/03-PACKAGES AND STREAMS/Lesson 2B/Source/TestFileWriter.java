import java.io.*;

public class TestFileWriter
{
	public static void main (String args[])
 	{
		String str="Character Stream Classes in Java";
    		try
    		{
      			FileWriter fout  = new FileWriter("stream.txt" );
		       fout.write(str, 0, str.length() );
      			fout.close();
    		}
		catch (IOException ioe)
		{
	  		System.out.println("Exception: " + ioe.toString());
		}
  	}	//End of main()
}
