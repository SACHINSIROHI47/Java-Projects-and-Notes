import java.io.*;
import java.util.*;
 public class  singlearry
{
  int[]arr=new int[5];
  int r;
  public int inputarry()throws IOException
  {
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
    System.out.println("please enter integer value");
       for(int a=0;a<5;a++)
       {
          r=Integer.parseInt(br.readLine());
          arr[a]=r;
       }
  return 0;
   }
  public int display()throws IOException
 {   
      for(int b=0;b<5;b++)
    { 
        System.out.println("display arry"+arr[b]);
    }
return 0;
   } 
public static void main(String []ar)throws IOException
  {
  singlearry obj=new singlearry();
   obj.inputarry();
   obj.display();
  }
 }
