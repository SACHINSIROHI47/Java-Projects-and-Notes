package oaeg.java;
import java.io.*;
public class ReadFile 
{
  public void DisplayFile()
  {
      try
      {
      String str;
      File f=new File("D:\\form7.htm");
      FileReader fr=new FileReader(f);
      BufferedReader br=new BufferedReader(fr);
      while((str=br.readLine())!=null)
      {
          System.out.println(str);
      }
      }
      catch(Exception e)
      {
         System.out.println("File Not Found");  
      }
  }    
    public static void main(String[] args) 
    {
        ReadFile obj=new ReadFile();
        obj.DisplayFile();
    }    
}
