import java.io.*;
import java.util.Date;
public class TestObjectOutput
{
	public static void main(String args[]) throws IOException
  	{
		FileOutputStream fout=new FileOutputStream("myfile.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fout);
	       oos.writeObject(new String("Date: "));
    		oos.writeObject(new Date());
    		oos.flush();
    		oos.close();
       }
}
