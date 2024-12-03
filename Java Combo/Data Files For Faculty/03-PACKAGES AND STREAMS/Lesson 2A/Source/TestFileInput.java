import java.io.*;
public class TestFileInput
{
public static void main(String args[])
{
/* Allocates a buffer of 100 bytes. */
byte buffer[]=new byte[100];	
try
{
/* Opens the filein.txt file for reading the contents using the FileInputStream class. */
FileInputStream file=new FileInputStream("filein.txt");	
/* Reads 50 bytes from the start of filein.txt file. */
file.read(buffer,0,50);	
}  catch(Exception e)
   {
     System.out.println("Exception: "+e.toString());
   } 
/* Initializes the str String from the buffer. */
String str=new String(buffer);	
System.out.println(str);
}	
}	
