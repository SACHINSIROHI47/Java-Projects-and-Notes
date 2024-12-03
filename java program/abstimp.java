import java.io.*;

abstract class abst
{
  abstract void getdata(int x,int y);
  abstract void display();
}
 class abstimp extends abst
{
   int i,j;
   void getdata(int a,int b)
{
    i=a;
    j=b;
 }

   void display()
   {
     int p=i+j;
     System.out.println(p);
   }

  public static void main(String []args)
    {
       abstimp b=new abstimp();
        b.getdata(15,25);
        b.display();
     }
}