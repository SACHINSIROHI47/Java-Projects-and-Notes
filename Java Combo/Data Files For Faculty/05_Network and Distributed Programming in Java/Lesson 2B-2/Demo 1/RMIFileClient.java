import java.io.*; 
import java.rmi.*;

public class RMIFileClient
{
   	public static void main(String args[]) 
	{
      		/*Checks the number of parameters passed at the command line*/
if(args.length != 2) 
		{
        		System.out.println("Error: You must pass the <file-name> and the <machine-address>.");
        		System.exit(0);
      		}
      		try 
		{
         		String str = "rmi://" + args[1] + "/FServer";
			/* Locate the instance of the server class */
         		FileRemote f = (FileRemote)Naming.lookup(str);
			byte[] data = f.loadFile(args[0]);
         		File file = new File(args[0]);
         		BufferedOutputStream outputFile = new BufferedOutputStream(new FileOutputStream(file.getName()));
         		outputFile.write(data,0,data.length);
         		outputFile.flush();
         		outputFile.close();
			System.out.println("Your specified file is downloaded from the server");
      		} 
		catch(Exception e) 
		{
         		System.out.println("Error: " + e);
         	}
   	}
}
