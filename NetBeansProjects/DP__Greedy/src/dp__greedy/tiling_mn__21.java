/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp__greedy;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author sanje
 */
public class tiling_mn__21 {
    
    public static void main(String[] args) throws Exception{
        
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        int[] dp = new int[n + 1];
        /*
        length and breadth of floor
        n = 39
        m = 16

        if filled with tile  m*1
        output = 61
        */
        dp[1] = 1;
        
        for (int i = 2; i <= n; i++) 
        {
            if (i < m) 
            {
                dp[i] = 1;
            }
            else if (i == m) 
            {
                dp[i] = 2;
            }
            else 
            {
                dp[i] = dp[i - 1] + dp[i - m];
            }
        }

        System.out.println(dp[n]);
    }
}
