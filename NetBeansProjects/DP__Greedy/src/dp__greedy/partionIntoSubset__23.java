/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp__greedy;

import java.io.*;

/**
 *
 * @author sanje
 */
public class partionIntoSubset__23 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());      // n is no of people
      int k = Integer.parseInt(br.readLine());      // k is no of teams m divide krna h

      if (n == 0 || k == 0 || n < k) {
         System.out.println(0);
         return;
      }

      /*
      n =4
      k =3
      output = 6
      
      */
      long[][] dp = new long[k + 1][n + 1];
      for (int t = 1; t <= k; t++)      // t = teams
      {
         for (int p = 1; p <= n; p++)   // p = people
         {
            if ( p<t)
            {
               dp[t][p] = 0;
            }
            else if(p==t)
            {
                dp[t][p]=1;
            }
            else
            {
                dp[t][p] = dp[t - 1][p - 1] + dp[t][p - 1] * t;
            }
         }
      }

      System.out.println(dp[k][n]);
        
    }
}
