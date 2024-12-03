package oaeg.java;
import java.io.*;
import java.util.*;
public class WriteJavaFile 
{
    public void FWrite()
    {
        try
        {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter 1st number ");
           int a=sc.nextInt();
           System.out.println("Enter 2nd number ");
           int b=sc.nextInt();
           int c=a+b;
           File f=new File("d:\\Javafile.txt");
           FileWriter fww=new FileWriter(f);
           BufferedWriter fw=new BufferedWriter(fww);
           fw.write("First Number is :- "+a);
           fw.newLine();
           fw.write("Second Number is :- "+b);
           fw.newLine();
           fw.write("Sum of two Number is :- "+c); 
           fw.newLine();
           System.out.println("Write Successfully...");
           fw.close();
        }
        catch(Exception e)
        {
           System.out.println("File not found/File Exception");
        }
    }
    public static void main(String[] args)
    {
     WriteJavaFile ob=new WriteJavaFile();
     ob.FWrite();
    }
 }
