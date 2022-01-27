package sorting;

import java.util.Scanner;

public class radixSort__7 
{
    public static void main(String[] args) {
       
        /*
        213
        97
        123
        718
        37
        982
        443
        37 97 123 213 443 718 982 

        */
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr= new int[n];
        
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
            max = Math.max(max, arr[i]);
        }
        
        radixSort(arr,max);
        
        for(int i=0 ;i<arr.length;i++)
        {
            System.out.print(arr[i] +" ");
        }
        
    }
    
    public static void radixSort(int[] arr,int max)
    {
        int exp=1;
        while(exp<=max)
        {
            countSort(arr,exp);
            exp= exp*10;
        }
   
    }
    
    public static void countSort(int[] arr, int exp)
    {
        int[] ans= new int[arr.length];
        
        // make frequency array
        int[] farr= new int[10];   // no from 0 to 9 =10
        for(int i=0; i<arr.length; i++)
        {
            farr[arr[i]/ exp %10]++;  // hrr element ke liye uska index nikal k frequency array m vha no of count ki value increase kr denge
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
            int pos= farr[val /exp %10];     // farr m se val ki frequency nikali
            int idx = pos-1;            // pos mtlb index(postn-1) 
            ans[idx] = val;             // ans m uss ind p val ddal di
            farr[val /exp %10]--;            // abb farr m us specific val ke liye uski frequency -1 se decrement kr di
            
        }
        //filling original array with the help of ans array
        for(int i = 0 ; i < arr.length; i++)
        {
            arr[i] = ans[i];
        }
    }
    
}
