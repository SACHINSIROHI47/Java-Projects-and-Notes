package oaeg.java;
import java.util.*;
public class AllLoop
{
    int cn,a=1;
    public void InputMethod()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number for how many time loop Execute ");
        cn=sc.nextInt();
    }
    public void WhileLoop()
    {
        InputMethod();
        while(cn>=a)
        {
            System.out.println("While Loop "+cn);
            cn--;
        }        
    }
    public void DoWhile()
    {
        InputMethod();
        a=1;
        do
        {
         System.out.println("Do While Loop "+cn);
         cn--;            
        }while(cn>=a);
    }
    public void ForLoop()
    {
        InputMethod();
      for(a=1;cn>=a;cn--)
      {
       System.out.println("For Loop "+cn);   
      }      
    }    
    public static void main(String[] args)
    {
      AllLoop obj=new AllLoop();
      obj.WhileLoop();
      obj.DoWhile();
      obj.ForLoop();
    }
    
}
