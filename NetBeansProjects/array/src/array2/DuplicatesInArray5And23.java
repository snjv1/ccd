/*
Given an array a[] of size N which contains elements from 0 to N-1, you need to find all the elements occurring more than once in the given array.

Example 1:

Input:
N = 4
a[] = {0,3,1,2}
Output: -1
Explanation: N=4 and all elements from 0
to (N-1 = 3) are present in the given
array. Therefore output is -1.
*/

package array2;
import java.util.*;
public class DuplicatesInArray5And23 {
    public static void main(String[] args)      
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter test cases");
        int t=sc.nextInt();
        
       while(t-->0)
       {
           int n=sc.nextInt();
           // size of array
           int a[]=new int[n];
           for(int i=0;i<n;i++)
           {
               a[i]=sc.nextInt();
           }
           Solution g=new Solution();
            g.duplicates(a, n);
         
       }
       
       int array[]={2,3,7,8,9,6,4,3,5,6,7,8,8,9};
       solution1 s=new solution1();
       s.Duplicate(array);
    }
}
         
class  Solution
{
    public void duplicates(int a[] ,int n)
    {
        ArrayList<Integer> al=new ArrayList<>();
        int brr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            brr[a[i]]++;
        }
        for(int i=0;i<n;i++)
        {
            if(brr[i]>1)
                al.add(i);
        }
        if(al.size()==0)
            al.add(-1);
        System.out.println(al);
                    
    }
}     
            
            
/* FOR ANY NO AND FOR UPTO ANY LIMIT TO FIND DUPLICATES IN ARRAY */
class  solution1
{
    public void Duplicate(int array[])
    {
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < array.length; i++) {  
            for(int j = i + 1; j < array.length; j++) {  
                if(array[i] == array[j])  
                    System.out.println(array[j]+ ",");  
            }  
        }  
    }
        
        
        
}

        
        
        
        
        
        
        
        
        
        
        
   

