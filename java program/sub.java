import java.io.*;
class super
{
  super()

 void add Num(int x,int y);
{
  int sum;
  sum=x+y;
    System.out.println("sum of number="+sum);
  }
  void display()
{
   System.out.println("this is the method of super");
 }
 }
  class sub extends super
  {
    sub()
    
   void Subtract (int x,int y);
  {
    int sub;
    sub=x,y;
     System.out.println("subtract of number="+sub);
  }
    public static void main(String[] arg)
    {
       sub s1=new sub();
       s1.display();
       s1.addNum(10,20);
       s1.subtract(50,10);
}
}

   