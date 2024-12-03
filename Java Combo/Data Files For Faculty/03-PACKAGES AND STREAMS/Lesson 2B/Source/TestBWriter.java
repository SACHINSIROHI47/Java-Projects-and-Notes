import java.io.*;
public class TestBWriter
{
	public static void main(String args[])
  	{
    		int ch;
    		BufferedWriter bw=null;
		System.out.print("Enter text(terrminate by pressing ctrl + z):");
    		try
    		{
      			bw=new BufferedWriter(new FileWriter("buffer.txt"));
      			while((ch=System.in.read())!=-1)	//Loop till end of file.
      			{
				bw.write(ch);
      			}
      			bw.flush();	//flushes the buffer
    		}
		catch(IOException ioe)
       		{
	 		System.out.println("Exception: "+ioe.toString());
       		}
  	}	//End of main()
}	//End of class
