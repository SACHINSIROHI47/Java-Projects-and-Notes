public class Testin
{
  public static void main(String args[])
  {
 /* Allocates a buffer of 80 bytes. */
    byte buffer[]=new byte[80];	
    System.out.println("Type the text to be displayed ");
    try
    {
/* Reads a line of text from the keyboard and stores it in buffer byte array. */
      System.in.read(buffer);	
    } catch(Exception e)
      {
	System.out.println("Exception: "+e.toString());
      }
/* Assigns the contents of the buffer array to str String. */
    String str=new String(buffer);	
/* Displays the text on the screen that is read using the System.in.read() method. */
    System.out.println(str);
  }	
}	
