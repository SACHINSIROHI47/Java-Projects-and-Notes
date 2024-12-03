public class TestStudent {
    public static void main(String[] args) {
        Student[] students = new Student[2];        
        students[0] = new UndergraduateStudent(1, "Java", "Duke");
        students[1] = new GraduateStudent(2, "J2EE", "Duke", "J2EE Technology");
        for(int i = 0; i < students.length; i++) {
            System.out.println(students[i]);
        }
    }
}
