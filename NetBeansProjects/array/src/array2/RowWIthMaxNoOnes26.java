
package array2;
import java.util.*;
public class RowWIthMaxNoOnes26 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a[][]=new int[n][m];
        
        
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        
        int row=0,i=0,j=m-1;
        
        while(i<n&&j>=0)
        {
            if(a[i][j]==1)
            {
                row=i;
                j--;
            }
            else 
                i++;
        }
        System.out.println(row);
        

               
        
    }
    
}
