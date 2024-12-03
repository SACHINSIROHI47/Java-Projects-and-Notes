public class Student {
    private int studentID;
    protected String firstName;
    protected String lastName;
    private Address address;
    private Course[] courses;
    private int numberOfCourses;
    
    public Student(int id, String fn, String ln) {
        studentID = id;
        firstName = fn;
        lastName = ln;
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
    
    public void setAddress(Address addr) {
        address = addr;
    }
    
    public void addCourse(Course course) {
        courses[numberOfCourses++] = course;
    }
    
    public String toString() {
        return "Name: " + firstName + " " + lastName;
    }
    
    public void printAddress() {
        System.out.println(address);
    }
    
    public void printCourses() {
        for(int i = 0; i < numberOfCourses; i++) {
            System.out.println(courses[i]);
        }
    }
}
