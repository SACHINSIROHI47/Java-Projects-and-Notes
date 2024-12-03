package oaeg.java;
public class VariableCasting
{
    void varcst()
    {
        long bigvalue=9689788L;
        System.out.println("Long Value "+bigvalue);
        int smallvalue=(int)bigvalue;
        System.out.println("Small Value "+smallvalue);
        double price=785.451D;
        System.out.println("Double Value "+price);
        float amt=784.45f;
        System.out.println("float Value "+amt);        
    }
    void varcsttwo()
    {
        
        float ft=Float.parseFloat("78.86");
        double amount=Double.parseDouble("7895.685");
        int num=Integer.parseInt("7890");
       
        System.out.println("Float value "+ft);
        System.out.println("Double value "+amount);
        System.out.println("Integer value "+num);         
    }
        public static void main(String[] args)
    {     
       VariableCasting ob=new VariableCasting();
       ob.varcst();
       ob.varcsttwo();
    }    
}
