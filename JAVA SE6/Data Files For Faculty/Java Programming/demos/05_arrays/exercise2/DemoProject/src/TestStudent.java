public class TestStudent {
    public static void main(String[] args) {
        Address addr = new Address("One Java Place", "HomeTown", "State", "12345");        
        Student student = new Student(1, "Java", "Duke", addr);
        System.out.println(student);
        
        Course c1 = new Course("SL-275", "Java Programming Language");
        Course c2 = new Course("SL-285", "Java Programming Language Workshop");
        student.addCourse(c1);
        student.addCourse(c2);
        student.printCourses();
    }
}
