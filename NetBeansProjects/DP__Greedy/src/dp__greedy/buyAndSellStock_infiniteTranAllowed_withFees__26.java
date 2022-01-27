/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp__greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author sanje
 */
public class buyAndSellStock_infiniteTranAllowed_withFees__26 {
    
    public static void main(String[] args) throws Exception 
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
     
      /*
        1. You are given a number n, representing the number of days.
        2. You are given n numbers, where ith number represents price of stock on ith day.
        3. You are give a number fee, representing the transaction fee for every transaction.
        4. You are required to print the maximum profit you can make if you are allowed infinite transactions, but has to pay "fee" for every closed transaction.
        Note - There can be no overlapping transaction. One transaction needs to be closed (a buy followed by a sell) before opening another transaction (another buy).
      
      input 
        12    N
        10
        15
        17
        20
        16
        18
        22
        20
        22
        20
        23
        25
        3       fees
      output        13
      */
      int[] prices = new int[n];
      for (int i = 0; i < prices.length; i++) {
         prices[i] = Integer.parseInt(br.readLine());
      }
      
      int fee= Integer.parseInt(br.readLine());
      
      int obsp= -prices[0];  // phla share khredne p jo laon ayega vo phle share prices jinta hoga kuki uspe 0 rupees the
      int ossp=0;           // aaj hi khrida to aaj bech nhi skta vrna profit nhi hoga
      
      for(int i=1; i<prices.length; i++)
      {
          int nbsp = 0;
          int nssp = 0;
          
          // buy
          
          
          if(ossp - prices[i]  >obsp)       // ( old profit - today prices )= current loan   > previous loan 
                                                                           // -6  > -9 
          {
              nbsp = ossp - prices[i];        // agr aaj khredte h to old profit - today prices 
          }
          else
          {
              nbsp = obsp;
          }
          
          
          // sell
          
          if(obsp + prices[i] - fee >ossp)          // old loan  + today price - fee > previous profit
                                                        // -9  +22 -3  > 7
          {
              nssp = obsp + prices[i] - fee;                        // previous loan + today price  -fee
          }
          else
          {
              nssp = ossp;          
          }
          
          
          obsp=nbsp;
          ossp=nssp;
      }
      
        System.out.println(ossp);
      
    }
}
