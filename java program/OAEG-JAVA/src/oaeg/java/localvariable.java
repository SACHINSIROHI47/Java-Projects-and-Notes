package oaeg.java;
public class localvariable 
{
    int stvar=1000,nm;
    public void method()
    {
        int var=100,num=0;      
        System.out.println(var);
        var=500;
        System.out.println(var);
        System.out.println(num);
    }
   
    public static void main(String[] args) 
    {
      localvariable  obj=new localvariable();
      obj.method();
      System.out.println(obj.stvar +" "+obj.nm);
      //System.out.println(obj.var);

    }
    
}
