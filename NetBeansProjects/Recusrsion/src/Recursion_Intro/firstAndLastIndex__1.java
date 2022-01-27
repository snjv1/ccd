/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion_Intro;

/**
 *
 * @author sanje
 */
public class firstAndLastIndex__1 
{
    public static void main(String[] args) 
    {
        int arr[] ={10,10,10,20,20,20,20,20,30,30,40};
        int data=20;
        
        int first_index=-1;
        int last_index=-1;
        
        int l=0;
        int h=arr.length-1;
        
        while(l<=h)
        {
            int mid=(l+h)/2;
            
            if(data>arr[mid])
                l=mid+1;
            else if(data<arr[mid])
                h=mid-1;
            else
            {
                last_index=mid;
                l=mid+1;
            }
        }
        System.out.println("last index is "+last_index );
        
        
         int lo=0;
        int hi=arr.length-1;
        
        while(lo<=hi)
        {
            int mid=(lo+hi)/2;
            
            if(data>arr[mid])
                lo=mid+1;
            else if(data<arr[mid])
                hi=mid-1;
            else
            {
                first_index=mid;
                hi=mid-1;
            }
        }
        System.out.println("fisrt index is "+first_index );
        
    }
}
