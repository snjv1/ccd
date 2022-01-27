package array2;


//Given	an array of size n and a number k,find all elements that appear more than n/k times	


// n is size of array where all elements are upto (n-1) and k should be less than n
import java.util.*;

public class Qtn18 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
         
         System.out.println("enter no k");
         int k=sc.nextInt();
         int p=n/k;
         int brr[]=new int[n];
         for(int i=0;i<n;i++)
         {
             brr[a[i]]++;
         }
         ArrayList<Integer> al=new ArrayList<>();
         for(int i=0;i<n;i++)
         {
             if(brr[i]>p)
                 al.add(i);
         }
          System.out.println(al);
    }
    
}
