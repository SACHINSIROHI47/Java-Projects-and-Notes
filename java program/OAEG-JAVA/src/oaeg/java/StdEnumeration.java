
package oaeg.java;

public class StdEnumeration 
{
    enum Day {sunday, monday, tuesday, wednesday, thursday, friday, saturday} 
  
    
    public static void main(String[] args) 
    {
      System.out.println(Day.friday);
      System.out.println(Day.valueOf("tuesday"));
       System.out.println(Day.valueOf("tuesday"));
      //ordinal show the index number
      System.out.println(Day.valueOf("tuesday").ordinal());
    }
    
}
