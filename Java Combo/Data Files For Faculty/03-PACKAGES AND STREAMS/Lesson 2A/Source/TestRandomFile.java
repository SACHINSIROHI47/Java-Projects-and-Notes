import java.io.*;
public class TestRandomFile 
{
  public static void main(String args[])
  {
	RandomAccessFile file=null;
	try
	{
	/* Opens the file in read/write mode */
	file=new RandomAccessFile("work.txt","rw");	
	file.writeInt(85);
	file.writeChar('V');
/* Places the file pointer at the beginning of file */
	file.seek(0); 
	System.out.println(file.readInt());
	System.out.println(file.readChar());
	file.seek(file.length());
	file.writeBoolean(true);
	file.seek(3);
	System.out.println(file.readBoolean());
	file.close();
	} catch(IOException e)
	{
	System.out.println("Exception: " +e);
 	}
      }  
}  
