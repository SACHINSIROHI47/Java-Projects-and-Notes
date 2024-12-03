
package oaeg.java;
import java.util.*;

public class FactorialwithAllLoop
{
    int fact,f=1,a=1;
    public void Accept()
    {
        Scanner sr=new Scanner(System.in);
        System.out.println("Enter number for Factorial");
        fact=sr.nextInt();
    }
    public void While_Factorial()
    {
        Accept();        
        while(a<=fact)
        {
            f=f*a;
            a++;            
        }
        System.out.println("Factorial with While Loop "+f);        
    }
     public void DoWhile_Factorial()
    {
        Accept();
        a=1;
        f=1;
        do{
            f=f*a;
            a++;            
        }
        while(a<=fact);
        
        System.out.println("Factorial with Do While Loop "+f);        
    }
     public void ForLoop_Factorial()
    {
         Accept();
         f=1;
        for(a=1;a<=fact;a++)
        {
            f=f*a;            
        }
        System.out.println("Factorial with For Loop "+f);        
    }
    public static void main(String[] args)
    {
      FactorialwithAllLoop obj=new FactorialwithAllLoop();
      obj.While_Factorial();
      obj.DoWhile_Factorial();
      obj.ForLoop_Factorial();
      
    }
    
}
