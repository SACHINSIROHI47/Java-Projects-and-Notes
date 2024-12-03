import java.io.*;
class grade
    {
      int marks;
      void accept()throws Exception
       {
        InputStreamReader inn =new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(inn);
        System.out.println("pleace enter marks");
          marks=Integer.parseInt(br.readLine());
       }
       void Proccess()
       {
        if(marks>=40 && marks<60)
        {
         System.out.println("Grade C");
        }
          else if(marks>=60 && marks<80)
        {
         System.out.println("Grade B");
        }
         else if(marks>=80 && marks<=100)
        {
         System.out.println("Grade A");
        }
          else 
        {
         System.out.println("Grade f");
        }
       }
        public static void main(String []arg)throws Exception
       {
         grade ob=new grade();
         ob.accept();
         ob.Proccess();
       }
    }