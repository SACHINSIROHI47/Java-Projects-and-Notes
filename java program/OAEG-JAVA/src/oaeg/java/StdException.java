package oaeg.java;
import java.util.*;

public class StdException 
{
    public void input()
    {
        try
        {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int a=sc.nextInt();
        System.out.println("Enter number for divide ");
        int b=sc.nextInt();
        int c=a/b;
        System.out.println(c);
        }
        catch(Exception e)
        {
         System.out.println("Invalid Input ");
        }
        finally
        {            
          System.out.println("RGPG COMUPTER CENTRE");
        }
    }
    public void Accept()throws Exception
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number ");
        int a=sc.nextInt();
        System.out.println("Enter number for divide ");
        int b=sc.nextInt();
        int c=a/b;
        System.out.println(c);
        
    }
       public static void main(String[] args)throws Exception 
    {
       StdException obj=new StdException(); 
       obj.input();
       obj.Accept();
    } 
}
