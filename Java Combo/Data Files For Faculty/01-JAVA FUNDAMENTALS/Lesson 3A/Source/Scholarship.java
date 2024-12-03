class Student
{
	boolean allpass;
	int totalmarks;
	Student()
	{
	allpass = true;
	totalmarks = 180;
	}
	void printstatus()
	{
	if((allpass != false) && (totalmarks > 175))
	  System.out.println("Scholarship granted");
	else
	  System.out.println("Scholarship not granted");	
	}
}

class Scholarship
{
	public static void main(String args[])
	{
		Student std1 = new Student();	
		System.out.println("Scholarship status of the Student ");                
		std1.printstatus();
		
	}

}
