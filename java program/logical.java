import java.io.*;
public class logical
{
  int H_marks=55, C_marks=60;
  logical()
{
  if((H_marks>33)||(C_marks>36))
{
  System.out.println("condition is true ");
}
else
{
  System.out.println("condition is false");
}
}
   public static void main(String[] arg)
  {
     logical obj=new logical();
  }
}