import java.io.*;
class prent
{
   prent()
   {
      System.out.println("base/existing class");
   }
 }
   public class chld extends prent
   { 
      chld()
      {
        System.out.println("child class");
      }
 public static void main(String args[])
     {
       chld obj=new chld();
      }
}  