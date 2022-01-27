package array2;
import java.util.*;

public class LongestCmmnSubsequence16 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();           
        }
        System.out.println(lcs(a));
    }
    
    	static int lcs(int a[]) {
	    int totalMaxLength = 1;
	    int count = 1;
	   
	    Arrays.sort(a);
	    
	    for(int i = 1; i < a.length; i++) {
	    
	        if(a[i] == a[i-1] + 1)
                {
	           count++;
	        } else
                {
	           count = 1;
	        }
	        
	        if(count > totalMaxLength) {
	            totalMaxLength = count; 
	        }
	        
	    }
	    
	    
	    return totalMaxLength;
	}
 
    
}
