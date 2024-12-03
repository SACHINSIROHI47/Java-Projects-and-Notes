import java.io.*;
public class TestDataOutput
{
public static void main(String args[])
{
  try
  {
DataOutputStream dos=new DataOutputStream(new                  FileOutputStream("text.txt"));
/*Writes an integer to dos.*/
dos.writeInt(25);	
/*Writes a float to dos.*/
dos.writeDouble(45.80);	
/*Writes a string to dos.*/
dos.writeUTF("Don Allen");	
/*Closes the dos.*/
dos.close();	
DataInputStream dis=new DataInputStream(new FileInputStream("text.txt"));
System.out.println("Integer is: "+dis.readInt());  
System.out.println("Double is: "+dis.readDouble());
System.out.println("String is: "+dis.readUTF());
} catch(FileNotFoundException fnfe)
    {
      System.out.println("Exception: "+fnfe.toString());
    }
    catch(IOException ioe)
    {
      System.out.println("Exception: "+ioe.toString());
    }
}	
}
