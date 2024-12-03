package oaeg.java;
import java.util.*;
public class FormFill 
{
    public void UserInput()
    {
        String state;
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your state only 'up' or 'delhi' are allow");
        state=sc.nextLine();
        if(state.equals("up")||state.equals("delhi"))
        {
          System.out.println("Enter your age between 18 to 27");
          age=sc.nextInt();
          if(age>=18 && age<=27)  
          {
            System.out.println("You are Eligible for fill form");
          } 
          else
          {
            System.out.println("You are Not Eligible for fill form");  
          }
        }
        else
        {
            System.out.println("You are not Belong to Up and Delhi");
        }
    }
    public static void main(String[] args)
    {
       FormFill ob=new FormFill();
       ob.UserInput();
    }
    
}
