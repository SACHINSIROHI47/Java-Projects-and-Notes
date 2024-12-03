package oaeg.java;
public class MethodOverloading
{
    int add;
 public void sum(int a,int b)
 {
     add=a+b;
     System.out.println("Sum of two number "+add);
 }
 public void sum(int a,int b,int c)
 {
     add=a+b+c;
     System.out.println("Sum of three number "+add);
 }
 
public static void main(String[] arg)
{
    MethodOverloading obj=new MethodOverloading();
    obj.sum(40,50,30);
}
}