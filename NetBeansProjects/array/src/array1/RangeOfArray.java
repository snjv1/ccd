

// program to find difference between max and min no of array
package array1;
import java.util.*;
public class RangeOfArray {
    public static void main(String[] args)
    {
         
        int[] arry={23,-1,-2,-5,5,43,2,1};
        
        int temp;
         for(int i=0;i<arry.length;i++)
        {
            System.out.print( arry[i]+"\t");           
        }
         System.out.println();
      
        for(int i=0;i<arry.length;i++)
        {
           for(int j=i+1;j<arry.length;j++)    
           {
               if(arry[i]>arry[j])
               {
                   temp=arry[i];
                   arry[i]=arry[j];
                   arry[j]=temp;
               }
           }
        } 
      
        System.out.println(" Sorted array is " +Arrays.toString(arry));
         
        
        int range;
        
        range=arry[arry.length-1]-arry[0];
        System.out.println(range);
    }}