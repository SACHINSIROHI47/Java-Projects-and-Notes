
package oaeg.java;
public class MultiDimArray2 
{
    public void MultiMethodDeclare()
    {
        int[][] arr=new int[2][2];
        arr[0][0]=10;
        arr[0][1]=20;
        arr[1][0]=45;
        arr[1][1]=90;
        System.out.println(arr[0][0]+" "+arr[0][1]+"\n"+arr[1][0]+" "+arr[1][1]);
    }
    public void MultiMethodDeclare2()
    {
        int[][] arr2=new int[][]{{10,20,45},{60,74,72},{11,40,55}};
        System.out.println("Display MultiDimensional Array ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println("");
        }        
    }
    public static void main(String[] args) 
    {
        MultiDimArray2 obj=new MultiDimArray2();
        obj.MultiMethodDeclare();
        obj.MultiMethodDeclare2();
    }
  }
