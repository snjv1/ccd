package sorting;

import java.util.Scanner;

public class insertionSort {
    public static void main(String[] args) {
        
      Scanner sc=new Scanner(System.in);
        
        int arr[]={12,45,23,51,19,8};
        int n =arr.length;
     
        for( int i=1;i<n;i++)
        {
            int current=arr[i];
            int j=i-1;
            
            while ( j >= 0 && arr[j] > current  )    
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        
        
        
        
        
        
        for(int i=0;i<n;i++)
        {
            System.out.println( arr[i] +" ");
        }
        
    }
}
