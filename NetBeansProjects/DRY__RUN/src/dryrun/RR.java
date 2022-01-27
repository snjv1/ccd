/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dryrun;

import java.util.*;

/**
 *
 * @author sanje
 */
public class RR 
{   
//    public static void main(String[] args)
//    {
//        Scanner sc=new Scanner(System.in);
//        
//        String abc=sc.nextLine();
//        
//        char array[]= abc.toCharArray();
//        
//        for(int i=array.length-1; i>=0; i--)
//        {
//            System.out.print(array[i]);
//        }
//    }
    
    public static void main(String[] args)
    {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2 ={2,5,6};
        int m=3,n=3;
        merge(nums1,m,nums2,n);
        
        for(int i :nums1)
        {
            System.out.println(nums1[i]);
        }
      
 

      
    }
    
        public static void merge(int[] nums1, int m, int[] nums2, int n) 
    {
        int[] res= new int[nums1.length+nums2.length];
        
        int i=0 , j=0,k=0;
        
        while( i<m && j<n )
        {
            if(nums1[i]<nums2[j])
            {
                res[k]=nums1[i];
                i++;
                k++;
            }
            else
            {
                res[k]=nums2[j];
                k++;
                j++;
            }
        }
        
       
        
        if(j<n)
        {
            res[k]=nums2[j];
            k++;
            j++;
            
        }
        
        for(int t=0;t<m+n;t++)
        {
            nums1[t]=res[t];
        }
        
    }
}