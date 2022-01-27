package array.pkg2d;

import java.util.Scanner;

/**
 *
 * @author sanje
 */
public class MatrixInSpiralForm28 {
    public static void main(String[] args) {
        
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
        
          for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                   System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
          System.out.println();
          
        Abc d=new Abc();
        d.traverse(arr, n,m);
    }
    
}

class Abc
{
    public void traverse(int arr[][],int n,int m)
    {
        int row_start=0;  // starting index of row
        int row_end=n-1; // ending or last index of row
        
        int column_start=0; //starting index of column
        int column_end=m-1; //ending or last index of column
        
        while(row_start<=row_end && column_start <= column_end)       
        {
            // for row start
            for(int i=column_start;i<=column_end;i++)
            { 
                System.out.print(arr[row_start][i]+ " ");            
            }
            System.out.println();
            row_start++;
            
            // for column end
            for(int i=row_start;i<=row_end;i++)
            {
                System.out.print(arr[i][column_end]+ " ");                
            }
            System.out.println();
            column_end--;
            
            //for row end
            for(int i=column_end;i>=column_start;i--)
               {
                   System.out.print(arr[row_end][i]+ " ");
               }
            System.out.println();
               row_end--;
            
            //for column start
            for(int i=row_end;i>=row_start;i--)
               {
                   System.out.print(arr[i][column_start]+ " ");
               }
            System.out.println();
               column_start++;
            }
        }   
    }
