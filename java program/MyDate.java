public class MyDate
{
  public  MyDate (int day,int month,int year)
  {
   this.day = day;
   this.month = month;
   this.year = year;
     System.out.println(day + " "+month + " "+year);
  }
  public static void main(String arg[])
  {
    MyDate obj=new MyDate(25,8,2017);
  }
}