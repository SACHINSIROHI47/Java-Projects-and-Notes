import java.io.*;
import java.util.*;

   public class dowhileloop
{
   int a=10;
   public void disp()
{
 do
{

  System.out.println("Display"+a);
  a++;
}
  while(a<10);
}
  public static void main(String ar[])
{
   dowhileloop obj=new dowhileloop();
   obj.disp();
 }
}