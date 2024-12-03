class Applicant 
{
		// Declaring data members
	String applicantID;
	String applicantName;
	String applicantAddress = "12, ParkStreet";
	String applicantPosition = "Manager";
		//Defining the method.
public void displayDetails()
	{
		//Code for displaying the values of data members.
	System.out.println("Applicant ID=" +applicantID);
	System.out.println("Applicant Name=" +applicantName);
	System.out.println("Applicant Address=" +applicantAddress);
System.out.println("Applicant Position=" +applicantPosition);
} 
}

class Candidate extends Applicant
{
		// Declaring the data members.
	String interviewDate;
	boolean candidateStatus = false;
		//Defining the method.
	public Candidate(String ID, String name, String intDate)
	{
	applicantID=ID;
		applicantName=name;
		interviewDate=intDate;
	}
public void displayDetails1()
	{
	displayDetails();
	System.out.println("Date for interview = " +interviewDate);
	System.out.println("Status of candidate=" +candidateStatus);
	}
	public static void main(String args[])
	{
	Candidate c = new Candidate(args[0], args[1], args[2]);
	c.displayDetails1();
	}
    }

