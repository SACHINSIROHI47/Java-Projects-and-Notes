import java.util.*;
public class GenSetExample {
 public static void main(String[] args) {
    Set<String> set = new HashSet<String>();
    set.add("one");
    set.add("second");
    set.add("3rd");
    // This line generates compile error
    set.add(new Integer(4)); 
    // Duplicate, not added
    set.add("second");        
    System.out.println(set);
  }
}