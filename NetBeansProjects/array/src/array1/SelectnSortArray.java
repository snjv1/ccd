package array1;
import java.util.*;
public class SelectnSortArray {
    public static void main(String[] args) {
       
        int temp,n;
        int arr[]=new int[20];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        n=sc.nextInt();
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
 
       for(int i=0;i<n-1;i++)
       {
           for(int j=i+1;j<n;j++)
           {
               if(arr[i]>arr[j])
               {
                  temp=arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
               }
           }
    }
        System.out.println("sorted array ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
            
    }
    
