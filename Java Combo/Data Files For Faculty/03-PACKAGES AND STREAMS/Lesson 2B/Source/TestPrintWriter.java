import java.io.*;
public class TestPrintWriter
{
	public static void main(String args[])
  	{
    		PrintWriter pw=null;
    		try
    		{
      			FileWriter file=new FileWriter("print.txt");
      			pw=new PrintWriter(file);
    		}
		catch(IOException ioe)
      		{
			System.out.println("Exception: "+ioe.toString());
      		}
    		pw.print("John David\t");
    		pw.print(24);
    		pw.println();
    		pw.print("Steve Smith\t");
    		pw.print(34);
    		pw.println();
    		pw.close();
  	}	//End of main()
}	//End of class TestPrintWriter
