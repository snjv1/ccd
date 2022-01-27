package dp__greedy;

import java.util.Scanner;

public class climbingStairWithJumps__3 
{
    public static void main(String[] args) {
        
        /*
        10
        3
        3
        0
        2
        1
        2
        4
        2
        0
        0
        */
        
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();
        int[] arr= new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
            
        }
        
        int[] dp = new int[n+1];
        dp[n]=1;  //6 ke liye 1 h or koi nhi h        
        
        for(int i =n-1; i>=0;i--) // traverse from last
        {
            for(int j=1; j<=arr[i] && i+j<dp.length ; j++)
            {
                dp[i] += dp[i+j];
            }
        }
        
        System.out.println("");
        System.out.println(dp[0]);
        
    }
    
}
