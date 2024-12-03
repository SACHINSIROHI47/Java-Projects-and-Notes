
package oaeg.java;

public class importpackage
{
    public void meassage()
    {
     System.out.println("This is importpackage class");   
    }

    public static void main(String[] args)
    {
        importpackage obj=new importpackage();
        obj.meassage();
        packageuse ob=new packageuse();
        ob.StdInformation();
        //ob.Display(); //this is private method can not be access
        //outside the class
        ob.stdmarks();
    
        
        
        
    }
    
}
