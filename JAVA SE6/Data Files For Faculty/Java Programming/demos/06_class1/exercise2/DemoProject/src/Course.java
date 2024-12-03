public class Course {
    private String number;
    private String title;
    
    public Course(String number, String title) {
        this.number = number;
        this.title = title;        
    }
    
    public String toString() {
        return number + ": " + title;
    }
}
