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
public class countBinaryString__12 {
    public static void main(String[] args) throws Exception {
      /*
        Input = 6;
        ouput = 21;
        
        */  
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      
      int[] dp0= new int[n+1];
      int[] dp1= new int[n+1];
      
      dp0[1]=1;
      dp1[1]=1;
      
      for(int i=2;i <=n; i++)
      {
          dp0[i]=dp1[i-1];
          dp1[i]=dp1[i-1] + dp0[i-1];
      }
      
      System.out.println(dp1[n] + dp0[n]);
      
      
      
       int zeroes = 1;
      int ones = 1;
      for(int i = 2; i <= n; i++){
         int nzeroes = ones;
         int nones = ones + zeroes;

         zeroes = nzeroes;
         ones = nones;
      }

      System.out.println(zeroes + ones);
      
    }
    
}
