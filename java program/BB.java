import java.io.*;

final class A
{  
  final void disp()
 {
    System.out.println("final class");
 }
 }
 class BB 
  {
    void message()
    {
      System.out.println("child class");
     }
  public static void main(String arg[])
   {
     A obj=new A();
     obj.disp();
     BB ob=new BB();
     ob.message();
   }
}

