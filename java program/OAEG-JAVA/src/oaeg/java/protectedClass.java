
package oaeg.java;
//Java support Multlevel Inheritance
// Java is not support Multiple Inheritance
class BaseClass
{
    public int a=400;
    private int b=500;
    protected int c=600;    
    
}
class student extends BaseClass
{
    protected int stdroll=501;
        
}
public class protectedClass extends student
{
    public protectedClass()
    {
        System.out.println("Public "+a);
        //System.out.println("Private "+b);
        System.out.println("protected "+c);
        System.out.println("proctected"+stdroll);
    }

    public static void main(String[] args) 
    {
        protectedClass obj=new protectedClass();
        
                
    }
    
}
