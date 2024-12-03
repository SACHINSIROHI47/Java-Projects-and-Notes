import java .io.*;
public class calculators
{
  int num1,num2,sum,sub,mul,div,mod;
  public int input()throws Exception
  {
    InputStreamReader is=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(is);
    System.out.println("enter first number");
    num1=Integer.parseInt(br.readLine());
    System.out.println("enter second number");
    num2=Integer.parseInt(br.readLine());
    return 0;
  }
  public int sum()
  {
  sum=num1+num2;
  return 0;
  }
   public int subtract()
  {
  sub=num1-num2;
  return 0;
  }
  public int multiply()
  {
  mul=num1*num2;
  return 0;
  }
  public int divide()
  {
  div=num1/num2;
  return 0;
  }
  public int modular()
  {
  mod=num1%num2;
  return 0;
  }
 public int display()
 {
  System.out.println("sum of two number"+sum);
  System.out.println("subtract of two number"+sub);
  System.out.println("multiply of two number"+mul);
  System.out.println("divide of two number"+div);
  System.out.println("modular of two number"+mod);
  return 0;
 }
public static void main(String arg[])throws Exception
 {
  calculators obj=new calculators();
  obj.input();
  obj.sum();
  obj.subtract();
  obj.multiply();
  obj.divide();
  obj.modular();
  obj.display();
 }
}

 
 
  