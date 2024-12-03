public class TestEmployee {
    public static void main(String[] args) {
        Employee emp = new Employee("Tom");
        System.out.println(emp.getTitle());
        try {
            emp.promoteToCEO();
        } catch(CustomException exp) {
            System.out.println(exp.getMessage());
        } finally {
            System.out.println(emp.getTitle());
        }
    }
}
