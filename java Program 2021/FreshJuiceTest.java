class FreshJuice {
enum FreshJuiceSize{ SMALL, MEDIUM, LARGE }
FreshJuiceSize size;
}
public class FreshJuiceTest {
public static void main(String args[]){
FreshJuice juice = new FreshJuice();
juice.size = FreshJuice.FreshJuiceSize.MEDIUM ;
System.out.println("Size: " + juice.size);
juice.size = FreshJuice.FreshJuiceSize.SMALL;
System.out.println("Size: " + juice.size);
}
}