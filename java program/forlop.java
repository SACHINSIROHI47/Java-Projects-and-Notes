import java.io.*;
public class forlop
{
 int tab;
 public int Accept()throws IOException
{
 InputStreamReader obb=new InputStreamReader(System.in);
 BufferedReader bb=new BufferedReader(obb);
 System.out.println("please enter number for table");
 tab=Integer.parseInt(bb.readLine());
 return 0;
 }
   public int tablemethod()
{
   for(int a=1;a<=10;a++)
   {
      System.out.println(tab+" * "+ a + " = "+ tab * a);
    }
   return 0;
 }
    public static void main(String[]arg)throws IOException
    {
      forlop obj=new forlop();
      obj.Accept();
      obj.tablemethod();
    }
}


