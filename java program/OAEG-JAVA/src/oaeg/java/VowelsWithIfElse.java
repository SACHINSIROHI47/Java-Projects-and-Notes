
package oaeg.java;
import java.util.*;
public class VowelsWithIfElse
{
    char vow;
    Scanner sr;
    public void input()
    {
        sr=new Scanner(System.in);
    }
    public void FirstVowelMethod()
    {
     System.out.println("Enter Character for vowels from a to z");
     input();
     vow=sr.next().charAt(0);
     if((vow=='a'||vow=='A')||(vow=='e'||vow=='E')||(vow=='i'||vow=='I')||
             (vow=='o'||vow=='O')||(vow=='u'||(vow=='U')))
     {
     System.out.println("Vowel is "+vow);
     }
     else
     {
     System.out.println("Consonent is "+vow);  
     }
     }

    public static void main(String[] args) 
    {
      VowelsWithIfElse ob=new VowelsWithIfElse();
      ob.FirstVowelMethod();
    }
    
}
