package dp__greedy;

import java.io.*;

public class buyAndSellStocks_OneTransAllowed__24 
{
    public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      
      /*
    9    N
    11
    6
    7
    19
    4
    1
    6
    18
    4
      
      output 17

      */
      int[] prices = new int[n];
      for (int i = 0; i < prices.length; i++) {
         prices[i] = Integer.parseInt(br.readLine());
      }

      int lsf = prices[0];     // maintain least price
      int op = 0;               // stor max profit
      for(int i = 1; i < prices.length; i++){
         if(prices[i] < lsf){
            lsf = prices[i];
         }

         int tp = prices[i] - lsf;      //today profit
         if(tp > op){
            op = tp;
         }
      }

      System.out.println(op);
   }

}
