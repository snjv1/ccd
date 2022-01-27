package array2;

import java.util.*;

public class SubArraySumZero12 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int n=sc.nextInt();
        
        int a[]=new int[n];
        
        for(int i=0;i<n;i++)
            a[i]=sc.nextInt();
        
        HashSet<Integer> hs=new HashSet<>();
        
        int sum=0,c=0;
        for(int i=0;i<n;i++)
        {
        sum+=a[i];
        if(a[i]==0||sum==0||hs.contains(sum))
        {
            c++;
           
        }
        hs.add(sum);
        }
        if(c>0)
            System.out.println("yes");
        else 
            System.out.println("no");
    }
    
}
