import java.io.*;
import java.util.*;
import java.lang.*;

class enumm
{
   enum season{winter,spring,summer,fall}
   enum day{sunday,monday,tuesday,wednesday,thursday,friday,saturday}

   public static void main(String arg[])
   {
      for(season s:season.values())
      System.out.println(s);
      System.out.println(".......");
      for(day d:day.values())
      System.out.println(d);
   }
}
      
       