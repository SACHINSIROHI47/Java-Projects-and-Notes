package oaeg.java;
public class SingliDimArray 
{
    public static void main(String[] args) 
    {
        int[] rollno=new int[4];
        rollno[0]=100;
        rollno[1]=200;
        rollno[2]=300;
        rollno[3]=400;
        System.out.println(rollno[0]+" "+rollno[1]+" "+rollno[2]+" "+rollno[3]);
        rollno[0]=1000;
        System.out.println(rollno[0]);
    
        String[] stdname={"Neelam","Gita","Sapna","nahid","bhawna","iqra"};
        for(int i=0;i<stdname.length;i++)
        {
            System.out.println("Name "+stdname[i]);
        }   
               
        
        int[] marks=new int[]{45,68,85};
        for(int i=0;i<marks.length;i++)
        {
            System.out.println("marks "+marks[i]);
        }
        
        
        int arr[]={10,20,30};
        for(int i=0;i<arr.length;i++)
        {
        System.out.println("Array "+arr[i]);
        }
    }   
}
