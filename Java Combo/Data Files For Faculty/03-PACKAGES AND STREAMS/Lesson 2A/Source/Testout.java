public class Testout
{
  public static void main(String args[])
  {
 /* Allocates a buffer of 30 bytes. */
    byte buffer[]=new byte[30];	
    System.out.println("Type the text to be displayed: ");
    try
    {
      /*Reads a line of text.*/
System.in.read(buffer);	
    } catch(Exception e)
      {
	System.out.println("Exception: "+e.toString());
      }
/*Initializes str String from buffer.*/
    String str=new String(buffer);	
    System.out.println(str);
  }	
}	
	
