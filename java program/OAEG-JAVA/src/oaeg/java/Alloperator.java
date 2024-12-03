package oaeg.java;
public class Alloperator 
{
    public void arithoperator()
    {
        //- + / % ^ 
        int a=500,b=600,c;
        c=a+b;
        System.out.println("Addition "+c);        
    }
    public void comparisonoperator()
    {
       // < > <= >= ==  !=
        int num1=50,num2=100;
        boolean result;
        result=num1>num2;
        System.out.println("Comparision  "+result);
        System.out.println("Comparision  "+ (num1<=num2));
        System.out.println("Comparision  "+ (100>=100));
        System.out.println("Comparision  "+ (100!=100));
        System.out.println("Comparision  "+ (10==180));
     }
    public void logicaloperator()
    {
        int a=40,b=60,c=100,d=85;
        System.out.println("Logical "+ ((a<b)&&(c>d)));
        System.out.println("Logical "+ ((a<=b)||(c==d)));
        System.out.println("Logical "+ (!(a<b)));
    }
    
    public static void main(String[] args) 
    {
        Alloperator obj=new Alloperator();
        obj.arithoperator();
        obj.comparisonoperator();
        obj.logicaloperator();        
      }    
}
