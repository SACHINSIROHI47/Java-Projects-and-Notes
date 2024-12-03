package oaeg.java;

public class StdConstructor 
{
    int a,b;   //member variable
public StdConstructor()
{
    a=100;      //assign value to member variable
    b=500;     //by constructor
    System.out.println("This is constructor");
    System.out.println(a+" "+b);
} 
public static void main(String[] arg)
{
    StdConstructor obj=new StdConstructor();    
}
}
