public class TestStudent {
    public static void main(String[] args) {
        Student student = new Student(1, "Java", "Duke");
        System.out.println(student);
        
        GraduateStudent grad = new GraduateStudent(2, "J2EE", "Duke", "J2EE Technology");
        System.out.println(grad);
    }
}
