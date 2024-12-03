import java.io.*;
class Files
{
public static void main(String args[])throws NullPointerException
{
String dirName = "C:/Test";
/* Creates an instance of the work.txt file using the File class. */
File f = new File(dirName, "work.txt");
/* Creates an instance of the renFile.txt file using the File class. */
File f3 = new File(dirName, "renFile.txt");
/* Displays the name of the file using the getName() method. */
System.out.println("File name is:" +f.getName());
/* Displays the path of the file using the getPath() method. */
System.out.println("Path of the file is:" +f.getPath());
/* Displays the parent directory of the file using the getParent() method. */
System.out.println("Parent directory is:" +f.getParent());
/* Displays the contents of the Test directory using the list() method. */
System.out.println("Listing the contents of directory");
/* Creates an instance of the Test directory using the File class. */
File f1 = new File(dirName);
String s[] = f1.list();
/* The loop executes for the number of files and directories present in the Test directory. */
for(int i = 0;i<s.length;i++)
{
/* Creates an instance of the File class for the file or directory contained in the Test directory. */
File f2 = new File("\t" +dirName+ "/" +s[i]);
/* If the contents of Test directory is a directory then enters the if block of the loop otherwise enters the else block. */
if(f2.isDirectory())
	{
	System.out.println("\t" +s[i] + "is a directory");
	}
	else
	{
	System.out.println("\t" +s[i] + "is a file");
	}
}
}
}
