import java.io.*;
public class stic
{
  public static int a;
  int b;
  public static void disp()
  {
     System.out.println("static method..."+a);
  }
  public void disp2()
   {
     System.out.println("non static method.."+b);
   }
    public static void main(String arg[])
  {
     stic obj=new stic();
     obj.a=100;
     obj.b=200;
     obj.disp();
     obj.disp2();
   }
}

