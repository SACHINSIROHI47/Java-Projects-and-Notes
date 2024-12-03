public class Student
{
	int roll_no;
	String name;
	float fee;
	public static void main(String []args)
	{
		Student object1 = new Student();
		object1.roll_no=101;
		object1.name="James Gosling";
		object1.fee=15000.45F;

		System.out.println("Welcome to RGPG");
		System.out.println("------------------------");
		System.out.println("Roll Number: "+object1.roll_no);
		System.out.println("Student Name: "+object1.name);
		System.out.println("Student Fee: "+object1.fee);
		System.out.println("------------------------");	
		
	}
}
