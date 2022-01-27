package sorting;

import java.util.Scanner;

public class binarySearch 
{
    public static void main(String[] args) {
     Scanner sc=new Scanner(System.in) ;  
    
    int arr[]={10,20,30,40,50,60,70,80,90,100};
    System.out.println("enter key to find ");
    int data=sc.nextInt();
    
    
    int l=0;
    int h=arr.length-1;
    
    while(l<=h)
    {
        int  mid=(l+h)/2;
       
        if(data>arr[mid])
            l=mid+1;
        else if(data<arr[mid])
        {
            h=mid-1;
        }
        else
        {
            System.out.println(mid);
            return;
        }
       
    }
    }

}