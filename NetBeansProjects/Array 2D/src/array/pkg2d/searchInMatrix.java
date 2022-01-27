//
//- 2D matrix Search   

//Problem
//Given a n x m matrix.
//Write an algorithm to find that the given value exists in the matrix or not.
//Integers in each row are sorted in ascending from left to right.
//Integers in each column are sorted in ascending from top to bottom.
//
//Constraints
//1 <= N,M <= 1,000
//
//Sample Test Case:
//Consider the following matrix:
//[
//[1, 4, 7, 11, 15],
//[2, 5, 8, 12, 19],
//[3, 6, 9, 16, 22],
//[10, 13, 14, 17, 24],
//[18, 21, 23, 26, 30]
//]
//Given target = 5, return true.
//
//Given target = 20, return false.

//EXPLANATION
//EXPLANATION
//https://www.youtube.com/watch?v=xKZFAkSt2UU&list=PLfqMhTWNBTe0b2nM6JHVCnAkhQRGiZMSJ&index=27




package array.pkg2d;

import java.util.Scanner;

public class searchInMatrix 
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
        
        System.out.println("enter target to find in matrix");
        int target =sc.nextInt();
        
        
        int row=0,colm=m-1;  
        
        boolean found=false;
        while(row<n && colm>=0)
        {
            if(arr[row][colm]==target)
            {
                found=true;
            }
            if(arr[row][colm]>target)
                colm--;
            else
                row++;
            
                
        }
        if(found)
            System.out.println("Found" + row + colm);
        else
            System.out.println("Not Found");
        
    }
    
    
}
