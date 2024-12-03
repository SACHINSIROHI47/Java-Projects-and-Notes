package oaeg.java;
import java.io.*;
import java.util.*;
public class InputFromUser 
{
    public void InputByStream()throws Exception
    {
        InputStreamReader in=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(in);
        System.out.println("Enter your Name");
        String stdname=br.readLine();
        System.out.println("Enter your RollNumber");
        int roll=Integer.parseInt(br.readLine());
        System.out.println("Enter your Fees");
        float fees=Float.parseFloat(br.readLine());        
        System.out.println("Name is "+stdname);
        System.out.println("Roll is "+roll);    
        System.out.println("Fees is "+fees);
    }
    public void InputByScanner()
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter your Name ");
        String nme=sc.nextLine();        
        System.out.println("Name is "+nme); 
        
        System.out.println("Enter a Number ");
        int a=sc.nextInt();
        System.out.println("Display a Number "+a);    
               
        System.out.println("Enter Character ");
        char ch=sc.next().charAt(0);
        System.out.println("Display Character "+ch);
        
        System.out.println("Enter price ");
        float price=sc.nextFloat();
        System.out.println("Price is "+price);   
  
    }    
    public static void main(String[] args)throws Exception 
    {
       InputFromUser ob=new InputFromUser();
       ob.InputByStream();
       ob.InputByScanner();
    }
    
}
