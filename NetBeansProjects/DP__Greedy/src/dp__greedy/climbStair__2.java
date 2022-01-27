package dp__greedy;


import java.util.Scanner;

public class climbStair__2 {
    
   public static void main(String[] args) throws Exception {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      
      int res= climbingStairs(n);
       System.out.println(res);
      
   }
   
      public static int climbingStairs(int n)
      {
          int[] dp = new int[n+1];
          dp[0]=1;

        for (int i = 1; i <= n; i++) 
        {
           if(i == 1){
              dp[i] = dp[i - 1];
        }
        else if(i == 2)
        {
              dp[i] = dp[i -1] +  dp[i - 2] ;
        }

        else if(i >= 3)
        {
              dp[i] = dp[i -1] +  dp[i - 2]+ dp[i - 3];
        }
      }

       return dp[n];
   }

}


                        


                        
    
    

