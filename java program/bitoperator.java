import java.io.*;
public class bitoperator
{
  public static void main(String arg[])
{
    int a=60;
    int b=13;	
    int c=0;
    
    c=a&b;
    System.out.println("a&b="+c);

     c=a|b;
    System.out.println("a|b="+c);

     c=a^b;
    System.out.println("a^b="+c);

     c=a<<b;
    System.out.println("a<<b="+c);

  
     c=a>>2;
    System.out.println("a>>b="+c);

     c=a>>>2;
    System.out.println("a>>>b="+c);
}
}