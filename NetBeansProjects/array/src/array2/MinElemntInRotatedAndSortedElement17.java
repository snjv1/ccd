package array2;

import java.util.*;

public class MinElemntInRotatedAndSortedElement17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        
       int low=0,high=n-1,mid=0;
       while(low<=high)
       {
           mid=(low+high)/2;
           
           if(a[low]<=a[high])
           {   System.out.println(low);
           return;
           }
           if(a[mid]>=a[low])
           {
               low=mid+1;
           }
           else
           { low=mid;
           }
       if(low==high)
       {
           System.out.println(a[low]);
       return;}
    }
       
    }
    
    
}
