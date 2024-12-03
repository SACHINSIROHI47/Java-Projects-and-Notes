package oaeg.java;
abstract class ColgAbstract
{
 abstract void display();
   
}
public class StdAbstract extends ColgAbstract
{
  void display()
  {
      System.out.println("This is abstract method calling");
  }
  void stdinfo()
  {
      System.out.print("Student information");
  }    
    public static void main(String[] args)
    {
     StdAbstract obj=new StdAbstract();
     obj.display();
    }    
}