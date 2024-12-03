import java.io.*;

public class calculator
{
   public int a,b,c;
 int input()
 {
  try
   {
   
   InputStreamReader inpt=new InputStreamReader(System.in);
   BufferedReader br=new BufferedReader(inpt);
   System.out.println("Enter First Number");
   a=(Integer.parseInt(br.readLine()));  
   System.out.println("Enter Second Number");
   b=(Integer.parseInt(br.readLine())); 
   }
   catch(Exception e)
   {
    System.out.println(e);
   } 
  return 0;
  }
 int sum()
 {
  c=a+b;
  return 0;
 }
 int display()
 {
  System.out.println("Sum of two Number is :-"+c);
return 0;
 }
     
 public static void main(String[] args)
 {
  calculator obj=new calculator();
  obj.input();
  obj.sum();
  obj.display();
 
  
   }
  }
