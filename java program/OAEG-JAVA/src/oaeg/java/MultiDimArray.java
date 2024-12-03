
package oaeg.java;
import java.util.*;
public class MultiDimArray 
{
    public static void main(String[] args) 
    {     
        int[] marks=new int[4];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Marks of students ");
               
        for(int i=0;i<4;i++)
        {
            marks[i]=sc.nextInt();
        }
        System.out.println("Display students Marks");
        
         for(int i=0;i<4;i++)
        {
            System.out.println(marks[i]);
        }        
    }    
}
