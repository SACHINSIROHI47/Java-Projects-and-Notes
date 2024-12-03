import java.io.*;
class forloop
{
   forloop()
  {
     int i;
     for(i=5;i>=1;i--)
   {
    System.out.println("REverse forloop ="+i);
   }
    System.out.println();
    for(i=1;i<5;i++)
   {
    System.out.println("sequence forloop +"+i);
   }
  }
   public static void main(String[]arg)
   {
   forloop ob=new forloop();
   }
}