public class TestStudent {
    public static void main(String[] args) {
        Address addr = new Address("One Java Place", "HomeTown", "State", "12345");        
        Student cust = new Student(1, "Java", "Duke", addr);
        
        System.out.println(cust);
    }
}
