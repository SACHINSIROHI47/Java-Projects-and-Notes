import java.io.*;
public class TestBuffer
{
	public static void main(String args[])	
	{
    		System.out.print("Please enter a string:");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));		//creates an instance of BufferedReader class
		String str=new String();
				
    		try
    		{
      			str=br.readLine();	//Reads a line of text into str
		}
		catch(IOException ioe)
       		{
	 		System.out.println("Exception: "+ioe.toString());
       		}
		System.out.print("The string entered is: ");
    		System.out.println(str);
  	}	//End of main()
}
