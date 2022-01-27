package dp__greedy;

import java.util.Scanner;

public class climbStairWithMinMoves__4 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();
        
        /*

        10   N
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
        
        int[] arr= new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        
        Integer[] dp = new Integer[n+1];
        dp[n]=0;
        
        for(int i=n-1 ; i>=0 ; i--)
        {
            if(arr[i]>0)  // agr jump hi given nhi h to hmm jump nhi krenge
            {
                int min= Integer.MAX_VALUE;
                for(int j=1; j<=arr[i] && i+j<dp.length; j++)
                {
                    if(dp[i+j]!=null)           // jha p hm jump lga rhe ho vha null na ho vha se rasta hona chahiye 
                    {
                        min= Math.min(min,dp[i+j]);
                    }
                    
                }
                if(min != Integer.MAX_VALUE)  // agr koi rasta mila h to usme +1 krdenge kuki us raste tk jane m bhi to ek jump lgega
                    dp[i]= min+1;
            }   
            
        }
        System.out.println("o th position se last tk jane ke liye itni jump lgegi");
        System.out.println(dp[0]);
    }
    
}
