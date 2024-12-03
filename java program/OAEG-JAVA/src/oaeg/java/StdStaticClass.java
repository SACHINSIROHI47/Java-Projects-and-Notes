package oaeg.java;
public class StdStaticClass
{
    //static variable Declare
    public static int a=100;
    //Instance Variable Declare
    public int num=600;
    
    //Static method
    public static void display()
    {
        System.out.println("This is static method");
    }    
    //instance method
      public void display2()
    {
        System.out.println("This is static method");
    }    
    
 public static void main(String[] arg)
{
    System.out.println("Static Variable "+a);
    display();
    StdStaticClass obj=new StdStaticClass();
    System.out.println("Instance Variable "+obj.num); 
    obj.display2();
}
}