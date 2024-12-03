package oaeg.java;
import java.util.*;

public class VowelsWithElseIf
{
    char vow;
    void VowelMethod()
    {
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter Character for vowels between a to z");
        vow=sn.next().charAt(0);
        if(vow=='a'||vow=='A')
        {
            System.out.println(vow+" is vowel");
        }
        else if(vow=='e'||vow=='E')
        {
            System.out.println(vow+" is vowel");
        }
        else if(vow=='i'||vow=='I')
        {
            System.out.println(vow+" is vowel");
        }
        else if(vow=='o'||vow=='O')
        {
            System.out.println(vow+" is vowel");
        }
        else if(vow=='u'||vow=='U')
        {
            System.out.println(vow+" is vowel");
        }
        else
        {
            System.out.println(vow+" is Consonent");
        }        
    }
    public static void main(String[] args) 
    {
        VowelsWithElseIf obj=new VowelsWithElseIf();
        obj.VowelMethod();
     
    }
    
}
