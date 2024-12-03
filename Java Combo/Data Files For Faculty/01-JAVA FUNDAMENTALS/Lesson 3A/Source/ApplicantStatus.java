class Applicant
{
	String applicantID;
String education;
	int age;
	Applicant(String id, String edu, int x)
	{
	applicantID = id;
	education = edu;
age = x;  		
	}
	void printstatus()
	{		
		Candidate cd = new Candidate();
		cd.displaystatus();
	}
	class Candidate 
	{
		String candidateStatus = null;
        		void setstatus()
		{
		if(age<25)
			candidateStatus = "Not Accepted";
		else
			candidateStatus = "Accepted";
      		}	
         
		void displaystatus()
		{
			setstatus();
			System.out.println("Candidate's applicant id :  " + applicantID);
			System.out.println("Candidate’s qualification is : " + education);
System.out.println("Candidate's application status :  " + candidateStatus);
		}
	}
}
class ApplicantStatus	 
{
	public static void main(String args[])
	{     
		Applicant app1 = new Applicant(args[0],args[1],26);
		System.out.println("Displaying the application status of the candidate");
		app1.printstatus();

	}
}
