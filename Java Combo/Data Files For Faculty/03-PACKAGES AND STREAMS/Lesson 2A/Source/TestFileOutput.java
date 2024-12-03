import java.io.*;
public class TestFileOutput
{
  public static void main(String args[])
  {
/* Allocates 100 bytes to the buffer. */
byte buffer[]=new byte[100];	
try
{
/* Reads 100 bytes into the buffer. */
      	System.in.read(buffer, 0, 100);	
}  catch(IOException ioe)
       {
	   System.out.println("Exception: "+ioe.toString());
         }
    try
    {
/* Opens a file for writing the output. */
      FileOutputStream fout = new FileOutputStream("text.txt");		/* Writes the contents of buffer to the output file. */
      fout.write(buffer);	
    }  catch(FileNotFoundException fnfe)
		 {
	   System.out.println("Exception: "+fnfe.toString());
		 }   
       catch(IOException ioe)
		 {
	   System.out.println("Exception: "+ioe.toString());
	 }  
  }	
}	
