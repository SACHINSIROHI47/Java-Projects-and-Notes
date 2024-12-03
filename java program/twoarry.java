import java.io.*;
import java.util.*;
 public class  twoarry
{
  int[][]arr=new int[5][5];
  int r;
  public int inputarry()throws IOException
  {
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
    System.out.println("please enter integer value");
       for(int a=0;a<3;a++)
       {
          for(int b=0;b<3;b++)
           {
          r=Integer.parseInt(br.readLine());
          arr[a][b]=r;
       }
    }
  return 0;
   }
  public int display()throws IOException
 {   
      for(int b=0;b<3;b++)
    {
         for(int a=0;a<3;a++)
        {    
        System.out.print("display arry"+arr[b][a]+" ");
        }
        System.out.println(" ");
    }
return 0;
   } 
public static void main(String []ar)throws IOException
  {
  twoarry obj=new twoarry();
   obj.inputarry();
   obj.display();
  }
 }
