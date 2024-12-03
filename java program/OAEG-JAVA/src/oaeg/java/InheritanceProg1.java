package oaeg.java;
class A
{
    int a=40,b=50,c;
public void addition()
{
    c=a+b;
}
}
public class InheritanceProg1 extends A
{
     int d=60;
public void sum()
{
 super.addition();
 c=c+d;
 System.out.println("Three no sum "+c);   
}
 public static void main(String[] args)
 {
    InheritanceProg1 obj=new InheritanceProg1();
    obj.sum();
}
}
