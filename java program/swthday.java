import java.io.*;
public class swthday
{
   public int day;
   public int Accept()throws Exception
   {
    InputStreamReader in=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(in);
    System.out.println("...............");
    System.out.println("please enter the day number");
    System.out.println("...............");
    day=Integer.parseInt(br.readLine());
    return 0;
   }
  public int switchmethod()
   {
   switch(day)
   {
    case 1:
    System.out.println("sunday");
     break;
    case 2:
    System.out.println("monday");
     break;
    case 3:
    System.out.println("tuesday");
     break;
    case 4:
    System.out.println("wednesday");
     break;
    case 5:
    System.out.println("thursday");
     break;
    case 6:
    System.out.println("friday");
     break;
    case 7:
    System.out.println("saturday");
     break;
    default:
    System.out.println("enter number is invalid");
     break;
    }
   return 0;
   }
   public static void main(String[]arg)throws Exception
  {
    swthday obj=new swthday();
    obj.Accept();
    obj.switchmethod();
}
}

