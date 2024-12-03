import java.io.*;
class Bank
{
public static void main(String args[])throws NullPointerException
{
String dirName = "C:/Test";
File f = new File(dirName, "work.txt");
File f3 = new File(dirName, "renFile.txt");
/* Displays the name of the file using the getName() method. */
System.out.println("File name is:" +f.getName());
/* Displays the path of the file using the getPath() method. */
System.out.println("Path of the file is: " +f.getPath());
/* Displays the name of parent directory of the work.txt file using the getParent() method. */
System.out.println("Parent directory is: " +f.getParent());
/* Displays the contents of the Test directory using the list() method. */
System.out.println("Listing the contents of directory ");
/* Creates an instance of the Test directory using the File class. */ 
File f1 = new File(dirName);
String str1[] = f1.list();
for(int i = 0;i<str1.length;i++)
{
	File f2 = new File("\t" +dirName+ "/" +str1[i]);
	if(f2.isDirectory())
	{
	System.out.println("\t" +str1[i] + " is a directory");
	}
	else
	{
	System.out.println("\t" +str1[i] + " is a file");
	}
}
f.renameTo(f3);
System.out.println("Renaming the work.text file with a new name: " +f3); 
System.out.println("Deleting the file: " +f);
f.delete();
/* Displays the contents of the Test directory after deleting the work.text file. */
String str[] = f1.list();
for(int i = 0;i<str.length;i++)
{
	File f2 = new File("\t" +dirName+ "/" +str[i]);
	if(f2.isDirectory())
	{
	System.out.println("\t" +str[i] + " is a directory");
	}
	else
	{
	System.out.println("\t" +str[i] + " is a file");
	}
}
}
}
