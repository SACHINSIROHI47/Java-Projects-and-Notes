import java.io.*;

public class mrkgrad
{
int marks;
public int Accept()throws Exception
{
InputStreamReader in=(new InputStreamReader(System.in));
BufferedReader bfr=new BufferedReader(in);
System.out.println("please enter the student marks for grade calculation");
marks=Integer.parseInt(bfr.readLine());
return 0;
}
public int grade()
{
 if((marks>=75)&&(marks<=100))
 {
    System.out.println("student grade a");
  }
 else if((marks>=50)&&(marks<74))
{
   System.out.println("student grade b");
}
  else if((marks>=33)&&(marks<49))
 {
   System.out.println("student grade c");
}
 else
  {
    System.out.println("student fail");
  }
return 0;
}

public static void main(String []arg)throws Exception
{
  mrkgrad obj=new mrkgrad();
  obj.Accept();
  obj.grade();
}
}