package oaeg.java;
public class BitwiseOperator 
{
    public void BitwiseMethod()
    {
        int a=5,b=6,d;
        System.out.println("Bitwise and operator "+(a&b));
        System.out.println("Bitwise or operator "+(a|b));
        System.out.println("Bitwise not operator "+~a);
        System.out.println("Bitwise XOR operator "+(a^b));       
    }
    public void BitwiseShiftMethod()
    {
        int num=9;
        System.out.println("Left Shift "+ (num<<2));
        System.out.println("Right Shift "+ (num>>2));
    }
    public void IncrementDecrementOperator()
    {
        int a=5,b,c=10,d;
        b=++a;
        System.out.println("PreIncrement "+b);
        System.out.println("After increment "+a);
        d=c++;
        System.out.println("PostIncrement "+d);
        System.out.println("After increment "+c);
        
        
    }
    public static void main(String[] args) 
    {
       BitwiseOperator obj=new BitwiseOperator();
       obj.BitwiseMethod();
       obj.BitwiseShiftMethod();
       obj.IncrementDecrementOperator();
    }    
}
