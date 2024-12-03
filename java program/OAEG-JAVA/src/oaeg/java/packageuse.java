
package oaeg.java;
public class packageuse 
{
    private void Display()
    {
        System.out.println("This is public Method");
    }
   public void StdInformation()
    {
        System.out.println("This is Student Information");
    }
   void stdmarks()    //default
   {
        System.out.println("This is student marks");
      }
    public static void main(String[] args)
    {
       packageuse ob=new packageuse();
       ob.Display();
       ob.StdInformation();
       ob.stdmarks();
    }    
}
