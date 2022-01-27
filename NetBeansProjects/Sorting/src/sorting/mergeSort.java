/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

/**
 *
 * @author sanje
 */
public class mergeSort {
    public static void main(String[] args) {
        
        
         int arr[]={12,11,13,5,6,7};
         
         
         int[] result = mergeSorting(arr,0,arr.length-1);
        
         // now print array after sorting
         for(int i=0;i<result.length;i++)
         {
             System.out.print(result[i] + " ");
         }
        
        
    }
    
    public static int[] mergeSorting(int arr[],int low, int high)
    {
        if(low==high)
        {
            int[] ba= new int[1];
            ba[0]=arr[low];
            return ba;
        }
     
            int mid=(low+high)/2;
            
            int[] lsa = mergeSorting(arr,low,mid);
            int[] rsa = mergeSorting(arr,mid+1,high);
            
            int[] ans = mergeTwoSortedArrays(lsa,rsa);
            
            return ans;
            
            
    }
    
    //lsa left side array
    //rsa right side array
    
    public static int[] mergeTwoSortedArrays(int[] a, int[] b)
    {
        int i=0;  // to iterate left array 
        int j=0;  // to iterate right array 
        int k=0;  // to iterate result array 
        
        int[] ans= new int[a.length+b.length];
        
        while(i < a.length && j < b.length)
        {
            if(a[i] <= b[j])
            {
                ans[k] = a[i];
                i++;
                k++;
            }
            else
            {
                ans[k] = b[j];
                j++;
                k++;
            }
        }

        while(i < a.length)
        {
            ans[k] = a[i];
            k++;
            i++;
        }

        while(j < b.length)
        {
            ans[k] = b[j];
            k++;
            j++;
        }

        return ans;
    }
}
        
    
    
    
    
     