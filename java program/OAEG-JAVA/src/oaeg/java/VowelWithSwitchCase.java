
package oaeg.java;
import java.util.*;
public class VowelWithSwitchCase 
{
    public void VowelsMethod()
    {
        char vow;
        Scanner sn=new Scanner(System.in);
        System.out.println("Enter character for vowels between a to z ");
        vow=sn.next().charAt(0);
        switch(vow)
        {
            case 'a':
            case 'A':
                System.out.println(vow+" is vowels");
                break;
            case 'e':
            case 'E':
                System.out.println(vow+" is vowels");
                break;
            case 'i':
            case 'I':
                System.out.println(vow+" is vowels");
                break;
            case 'o':
            case 'O':
                System.out.println(vow+" is vowels");
                break;
            case 'u':
            case 'U':
                System.out.println(vow+" is vowels");
                break;
            default:
                 System.out.println(vow+" is consonent");
                
        }
    }
    public static void main(String[] args) 
    {
     VowelWithSwitchCase obj=new VowelWithSwitchCase ();
     obj.VowelsMethod();
    }    
}
