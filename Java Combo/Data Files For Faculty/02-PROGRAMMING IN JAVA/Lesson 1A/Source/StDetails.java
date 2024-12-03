class StudentInformation
{
String studentID;
String studentName;
void showName()
{
System.out.println("ID of the student is : " +studentID);
System.out.println("Name of the student is : " +studentName);
}
}
class MarksInformation extends StudentInformation
{
float mark1= 78;
float mark2 = 89;
void displayMarks()
{
System.out.println("Marks of "+ studentName+ " are :");
System.out.println("Mark1 = " +mark1);
System.out.println(" and Mark2 = "+mark2);
}
}
interface MedDetail
{
String bloodGroup = "O +ve";
float height = 5.7F;
void putDetails(); // An abstract method that is declared but not implemented
}
class StudentsData extends MarksInformation implements MedDetail
{
float total;
public StudentsData(String stID, String stName)
{
studentID=stID;
studentName=stName;
}
public void putDetails()
{
System.out.println("Blood Group of " + studentName + " is :" + bloodGroup);
System.out.println("Height of " + studentName + " is :" +height);
}
void displayTotal()
{
total = mark1 + mark2;
showName();
displayMarks();
putDetails();
System.out.println("The total marks scored by " + studentName + " are :" +total);
}
}
class StDetails
{
public static void main(String args[])
{
StudentsData ds = new StudentsData(args[0], args[1]);
ds.displayTotal();
}
}
