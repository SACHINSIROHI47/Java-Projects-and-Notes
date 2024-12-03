package javaapplication1;
public class NewException extends Exception
{
   public NewException()
{
   int div,num1=10,num2=5;
   try
  {
     div=num1/num2;
     System.out.println("divide:"+div);
   }
    catch( Exception e)
{
   System.out.println("Exception:"+e);
 }
   finally
   {
     System.out.println("finally block is Exception");
    }
  }
   public static void main (String[]ar)
{
    NewException obb = new NewException();
  }
}