package oaeg.java;

public class ConstructorOverloading 
{
  int sm;
public ConstructorOverloading(int a,int b)
{
    sm=a+b;
    System.out.println("This is constructor");
    System.out.println("Sum of two no "+sm);
} 
public ConstructorOverloading(int a,int b,int c)
{
    sm=a+b+c;
    System.out.println("This is constructor");
    System.out.println("Sum of three no "+sm);
} 
public static void main(String[] arg)
{
    ConstructorOverloading obj=new ConstructorOverloading(10,50,40);    
}
}

