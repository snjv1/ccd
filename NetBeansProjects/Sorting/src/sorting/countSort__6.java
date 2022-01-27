package sorting;

import java.util.Scanner;

public class countSort__6 
{
    public static void main(String[] args) throws Exception {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
      max = Math.max(max, arr[i]);
      min = Math.min(min, arr[i]);
    }
    countSort(arr,min,max);
    
    for(int i=0; i<arr.length; i++)
    {
        System.out.print(arr[i]+" ");
    }
    
    }
    
    public static void countSort(int[] arr, int min, int max)
    {
        int range =max-min+1;
        int[] ans= new int[arr.length];
        
        // make frequency array
        int[] farr= new int[range];
        for(int i=0; i<arr.length; i++)
        {
            farr[arr[i]-min]++;  // hrr element ke liye uska index nikal k frequency array m vha no of count ki value increase kr denge
        }
        
        //convert frequency array into prefix sum array
        for(int i=1; i<farr.length ;i++)   // prefix krne ke liye i=1 se hoga
        {
            farr[i] += farr[i-1];
        }
        
        // stable sorting(( filling ans array))
        for(int i= arr.length-1; i>=0; i--)
        {
            int val = arr[i];           // value li original m se
            int pos= farr[val-min];     // farr m se val ki frequency nikali
            int idx = pos-1;            // pos mtlb index(postn-1) 
            ans[idx] = val;             // ans m uss ind p val ddal di
            farr[val-min]--;            // abb farr m us specific val ke liye uski frequency -1 se decrement kr di
            
        }
        //filling original array with the help of ans array
        for(int i = 0 ; i < arr.length; i++)
        {
            arr[i] = ans[i];
        }
    }
  
    
}
