public class StudentCons
{
	public StudentCons()
	{
		System.out.println("Welcome to RGPG");
	}
	public void show()
	{
		int roll_no;
		String name;
		float fee;

		roll_no=101;
		name="James Gosling";
		fee=4500.98F;
		
		System.out.println("------------------------");
		System.out.println("Roll Number:"+roll_no);
		System.out.println("Student Name: "+name);
		System.out.println("Student Fee: "+fee);
		System.out.println("------------------------");
	}
	public static void main(String []args)
	{
		StudentCons object1 = new StudentCons();	
		object1.show();
	}
}
