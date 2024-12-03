import java.io.*;
public class TestBufferedOutput
{
  public static void main(String args[])
  {
    String str="Creating a program using the BufferedOutputStream. ";
    byte buffer[]=str.getBytes();	
BufferedOutputStream br = new BufferedOutputStream(System.out);
    try
    {
      br.write(buffer,0,50);	
      /* Flushes the contents of the output buffer. */
br.flush();	
    }  catch(IOException ioe)
         {
	   System.out.println("Exception: "+ioe.toString());
         }
  }	
}	
