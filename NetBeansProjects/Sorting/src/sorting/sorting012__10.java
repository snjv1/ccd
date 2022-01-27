package sorting;

import java.util.Scanner;


public class sorting012__10 
{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr= new int[n];
        
        for(int i=0; i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        sort012(arr);
        
         for(int i=0; i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
    
    public static void sort012(int[] arr)
    {
        int i=0, j=0,k=arr.length-1;
        
         // 0 to j-1  ->  0
        // j to i-1  ->  1
        // k+1 to end tk -> 2
        
        //i to k is unknown
        while(i<=k)
        {
            if(arr[i]==0)
            {
                swap(arr,i,j);
                i++;
                j++;
            }
            else if(arr[i]==1)
            {
                i++;
            }
            else
            {
                swap(arr,i,k);
                k--;        
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
