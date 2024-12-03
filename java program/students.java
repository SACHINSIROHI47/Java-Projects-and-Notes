import java.io.*;

public class students
{
  public int a,b,c;
  public static int marks;
     students()
     {
     System.out.println("constructor automatically invoke:.");
     a=100;
     b=200;
     c=a+b;
     }
  public void disp()
{
  System.out.println("display java program:"+c);
  System.out.println("hello oaeg students");
}
  public static void main(String arg[])
{
   students obj1=new students();
    obj1.disp();
   students obj2=new students();
   System.out.println(obj2.marks=100);
 }
}
