import java.io.*;
class input
{
 int a,b,c;
 input()throws Exception
   {
     InputStreamReader inn =new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(inn);
      System.out.println("Enter Ist number");
      a=Integer.parseInt(br.readLine());
      System.out.println("Enter 2nd number");
      b=Integer.parseInt(br.readLine());
      c=a+b;
      System.out.println("sum of two number ="+c);
   }
 public static void main(String[]arg)throws Exception
   {
   input ip = new input();
   }
}