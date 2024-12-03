class Student
{
	public int roll_no;
	public String name;
	public float fee;

	public void display()
	{
		System.out.println("Roll No. : "+roll_no);
		System.out.println("Name : "+name);
		System.out.println("Fee : "+fee);
	}
}

class Array3
{
	public static void main(String []args)
	{
		Student []array1 = new Student[3];

		array1[0] = new Student();
		array1[1] = new Student();
		array1[2] = new Student();

		array1[0].roll_no= 101;
		array1[0].name="Ajay Sharma";
		array1[0].fee=6000.00F;
		
		array1[1].roll_no= 102;
		array1[1].name="Bill Gates";
		array1[1].fee=4000.00F;

		array1[2].roll_no= 102;
		array1[2].name="Mikal Joseph";
		array1[2].fee=3000.00F;
				
		System.out.println("Student1");
		System.out.println("----------");
		array1[0].display();
		System.out.println("----------");
		System.out.println("Student2");
		System.out.println("----------");
		array1[1].display();
		System.out.println("----------");
		System.out.println("Student3");
		System.out.println("----------");
		array1[2].display();		
		System.out.println("----------");		
	}
}
		