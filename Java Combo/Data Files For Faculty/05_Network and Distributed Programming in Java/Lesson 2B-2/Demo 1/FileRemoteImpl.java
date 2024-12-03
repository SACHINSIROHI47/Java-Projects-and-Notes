import java.io.*;
import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;

public class FileRemoteImpl extends UnicastRemoteObject implements FileRemote 
{
	private String name;
	/* Define the default constructor */
   	public FileRemoteImpl(String str) throws RemoteException
	{
		super();
		name = str;
   	}
	
	/* Define the remote method */
   	public byte[] loadFile(String filename)
	{
      		try 
		{
			/* Create the object of File class */
         		File file = new File(filename);
			/* Creates the byte array same as the size of the file*/
         		byte bufferFile[] = new byte[(int)file.length()];
			/* Create the object of BufferedInputStream class to read the file */
         		BufferedInputStream inputFile = new BufferedInputStream(new FileInputStream(filename));
			/* Read the file */
         		inputFile.read(bufferFile,0,bufferFile.length);
			/* Close the file */
         		inputFile.close();
         		return(bufferFile);
      		} 
		catch(Exception e)
		{
         		System.out.println("Error: " + e);
       		}
		return(null);
   	}
}
