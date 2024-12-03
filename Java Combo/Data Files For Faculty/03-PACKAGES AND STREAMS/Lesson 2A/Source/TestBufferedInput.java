import java.io.*;
public class TestBufferedInput
{
public static void main(String args[])
{
  /*Allocates 100 bytes to buffer.*/
  byte buffer[]=new byte[100];		
  BufferedInputStream bis=new BufferedInputStream(System.in);
  try
  {
   /* Reads 50 bytes from keyboard and stores into the buffer. */
    bis.read(buffer,0,50);		
   } catch(Exception e)
     {
       System.out.println("Exception: "+e.toString());
   }
/* Initializes the str String from buffer. */
String str=new String(buffer);		
System.out.println(str);
}	
}
