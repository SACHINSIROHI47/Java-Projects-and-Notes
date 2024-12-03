public class Student {
    private int studentID;
    private String firstName;
    private String lastName;
    private Address address;
    private Course[] courses;
    private int numberOfCourses;
    
    public Student(int id, String fn, String ln, Address addr) {
        studentID = id;
        firstName = fn;
        lastName = ln;
        address = addr;
        courses = new Course[5];
    }
    
    public int getStudentID() {
        return studentID;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public Address getAddress() {
        return address;
    }
    
    public void addCourse(Course course) {
        courses[numberOfCourses++] = course;
    }
    
    public String toString() {
        return firstName + " " + lastName + "\n" + address.toString();
    }
    
    public void printCourses() {
        for(int i = 0; i < numberOfCourses; i++) {
            System.out.println(courses[i]);
        }
    }
}
