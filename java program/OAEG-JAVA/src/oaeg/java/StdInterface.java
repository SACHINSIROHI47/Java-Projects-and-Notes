package oaeg.java;
interface stdinformation
{
public void stdMarks();
}

interface collegeInfo
{
   public void collegedetails();
}

public class StdInterface implements stdinformation,collegeInfo
{
    public void stdMarks()
    {
        System.out.println("Student Marks");
    }
    public void collegedetails()
    {
        System.out.println("Colege Details");
    }
    public static void main(String[] args) 
    {
      StdInterface obj=new StdInterface();
      obj.stdMarks();
      obj.collegedetails();
    }
}