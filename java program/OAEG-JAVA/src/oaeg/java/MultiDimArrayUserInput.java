package oaeg.java;
import java.util.*;
public class MultiDimArrayUserInput {
    public static void main(String[] args) 
    {      
        Scanner sc=new Scanner(System.in);
        int[][] arr2=new int[2][2];
         System.out.println("Enter Values in MultiDimensional Array ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
               arr2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Display MultiDimensional Array ");
        for(int k=0;k<2;k++)
        {
            for(int m=0;m<2;m++)
            {
                System.out.print(arr2[k][m]+" ");
            }
            System.out.println("");
        }        
    }
}
  
    

