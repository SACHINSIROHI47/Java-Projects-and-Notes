import java.io.*;
class weeks
{
  int day;
  char ch;
  float price;
     void input()throws Exception
   {
     System.out.println("Enter integer number");
     day=(int)System.in.read();
     System.out.println("Enter charecter");
     ch=(char)System.in.read();
     System.out.println("Enter charecter");
     price=(float)System.in.read();
   }
     void input2()throws Exception
    {
     InputStreamReader in=new InputStreamReader(System.in); 
     BufferedReader br=new BufferedReader(in);
     System.out.println("...method 2nd...");
     System.out.println("Enter name");
     String name=br.readLine();
     System.out.println("Enter number");
     String a=br.readLine();
     System.out.println("Enter number2");
     String b=br.readLine();
     int num1,num2,sum;
     num1=Integer.parseInt(a);
     num2=Integer.parseInt(b);
     sum=num1+num2;
     System.out.println("Enter name= "+name); 
     System.out.println("sum of two number= "+sum);
    }
       public static void main(String []arg)throws Exception
       {
         weeks obj=new weeks();
         obj.input();
         obj.input2();
       }
}