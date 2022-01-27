package dp__greedy;

import java.io.*;
import java.util.Scanner;

public class minCostPath__5 
{
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int m = Integer.parseInt(br.readLine());
      int[][] arr = new int[n][m];

      for (int i = 0; i < n; i++) {
         String str = br.readLine();
         for (int j = 0; j < m; j++) {
            arr[i][j] = Integer.parseInt(str.split(" ")[j]);
         }
      }
        
        /*
        6       N
        6       M
        0 1 4 2 8 2
        4 3 6 5 0 4
        1 2 4 1 4 6
        2 0 7 3 2 2
        3 1 5 9 2 4
        2 7 0 8 5 1
        
        OUTPUT 23
        */
        
        
        
        
      int[][] dp = new int[arr.length][arr[0].length];
      
      for(int i = arr.length - 1; i >= 0; i--)
      {
         for(int j = arr[0].length - 1; j >= 0; j--)
         {
            if(i == arr.length - 1 && j == arr[0].length - 1)   // last box
            {
               dp[i][j] = arr[i][j];
            }
            else if(i == arr.length - 1)                        // last row
            {
               dp[i][j] = arr[i][j] + dp[i][j + 1];
            }
            else if(j == arr[0].length - 1)                     // last column
            {
               dp[i][j] = arr[i][j] + dp[i + 1][j];
            }
            else                                                // sara bacha huha part
            {
               dp[i][j] = arr[i][j] + Math.min(dp[i][j + 1], dp[i + 1][j]);
            }
         }
      }

      System.out.println(dp[0][0]);
        
    }
    
}
