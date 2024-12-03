import java.util.Scanner;
public class dowhileloop2
{
public static void main(String args[])
{
 Scanner Kb=new Scanner(System.in);
int choice;
do
{
  System.out.println("enter your choice");
  System.out.println("1:transaction no");
  System.out.println("2: display transaction no");
  System.out.println("exit");
  choice=Kb.nextInt();
  switch(choice)
{
  case 1:
  case 2:
  case 3:
  case 4:
      System.out.println("under construction");
      System.out.println();
      break;
      case 5:
      break;
     
}
 }
    while(choice>0 && choice<5);
}
}
