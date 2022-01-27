package sorting;

import java.util.Scanner;

public class sortArray01__9 
{
    public static void main(String[] args) 
    {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    
    for (int i = 0; i < n; i++){
        arr[i] = scn.nextInt();
    }

   int result =  sort01(arr);
    
        System.out.println(result);
    
    
    
    
    }
    
    public static int sort01(int[] arr)
    {
        
        // 0 to j-1  ->  All Zeroes
        // j to i-1  ->  All Ones's
        // i to arr.length-1  ->  All unknowns
        
        int i=0, j=0;
        
        while(i<arr.length)
        {
            if(arr[i]==0)
            {
                swap(arr,i,j);
                i++;
                j++;
            }
            else
            {
                i++;
            }
        }
        
         
        
    }
    
    public static void swap(int[] arr, int i, int j)
    {
        int temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    
    
}
