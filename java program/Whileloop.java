import java.io.*;
import java.util.*;

  public class Whileloop
{
  int a=1;
  public void disp()
{
  while(a<=10)
{
  System.out.println("display"+a);
  a++;
 }
} 

  public static void main(String ar[])
{
 Whileloop obj=new  Whileloop();
 obj.disp();
}
}