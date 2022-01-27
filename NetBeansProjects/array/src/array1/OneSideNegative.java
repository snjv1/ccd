//// program to move all elements to one side
package array1;
import java.util.*;
public class OneSideNegative {
    public static void main(String[] args) {
        
        int arr[] = {-1,56,-3,-634,-5,345,-4};
        int n=arr.length;
        
         int j = 0, temp; 
         for(int i=0;i<n;i++)
         {
             if(arr[i]<0)
             {
                 if(i!=j)
                 {
                 temp=arr[i];
                 arr[i]=arr[j];
                 arr[j]=temp;
                 }
                 j++;
             }
         }

        
        
        
       for(int i=0;i<n;i++)
       {
           System.out.print(arr[i] +"\t");
       }
    }
}
