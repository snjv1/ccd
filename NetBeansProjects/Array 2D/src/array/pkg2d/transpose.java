package array.pkg2d;
import java.util.*;

public class transpose 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //size of row
        int m=sc.nextInt();  // size of column
        int arr[][]=new int[n][m];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        System.out.println();
        
        /*
        transpose of matrix 
        transpose of matrix 
        transpose of matrix 
        */
        
       
        for(int i=0;i<n;i++ )
            for(int j=i;j<m;j++ )
                arr[i][j]=arr[i][j] + arr[j][i] -(arr[j][i]=arr[i][j]);
            
        
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                System.out.print(arr[i][j]+ " ");
            }
            System.out.println();
        }



/* multiplication of matrix   
multiplication of matrix   
multiplication of matrix   
multiplication of matrix   

for multiplication column of 1 matrix and rows of 2 matrix should be equal
for multiplication column of 1 matrix and rows of 2 matrix should be equal
for multiplication column of 1 matrix and rows of 2 matrix should be equal

             

*/
 

    }
}
