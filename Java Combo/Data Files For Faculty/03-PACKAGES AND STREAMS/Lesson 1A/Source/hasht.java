import java.util.*;
class hasht
{
public static void main(String args[])
{
Hashtable ht;
ht = new Hashtable();
Enumeration names;
String str;
double db;
ht.put("Albert", new Double(3434.34));
ht.put("Tom", new Double(123.22));
ht.put("Todd", new Double(99.22));
ht.put("Smith", new Double(-19.08));
/* Display balance in hash table */
names=ht.keys();
while(names.hasMoreElements())
{
str=(String)names.nextElement();
System.out.println(str + ":" + ht.get(str));
}
System.out.println();
/*Deposit $1000 into Albert's account*/
db=((Double)ht.get("Albert")).doubleValue();
ht.put("Albert", new Double(db+1000));
System.out.println("Albert's new Balance:"+ht.get("Albert"));
}
}
