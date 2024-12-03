
package oaeg.java;
import java.util.*;
public class ConditionalProgram 
{
    public void EvenOddMethod()
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number for Even/Odd Checking");
        num=sc.nextInt();
        if(num%2==0)
        {
            System.out.println("Even number is "+num);
        }
        else
        {
            System.out.println("Odd number is "+num);
        }
    }
    public static void main(String[] args)
    {
        ConditionalProgram obj=new ConditionalProgram();
        obj.EvenOddMethod();
       
    }
    
}
