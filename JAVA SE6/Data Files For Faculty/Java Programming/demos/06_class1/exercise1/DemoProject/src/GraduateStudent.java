public class GraduateStudent extends Student {
    private String thesisTitle;
    
    public GraduateStudent(int id, String fn, String ln, String thesis) {
        super(id, fn, ln);
        thesisTitle = thesis;
    }
    
    public String toString() {
        return "Name: " + firstName + " " + lastName + "\nThesis: " + thesisTitle;        
    }
    
}
