package dp__greedy;

import java.io.*;

public class buyAndSellStock_infiniteTranAllowed_withCOOLDOWN__27 {
    
    
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      
      int[] prices = new int[n];
      for (int i = 0; i < prices.length; i++) {
         prices[i] = Integer.parseInt(br.readLine());
      }

      /*
input
        12  N
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
      output  19
              */
      int obsp = -prices[0];
      int ossp = 0;
      int ocsp = 0;
      for(int i = 1; i < prices.length; i++){
         int nbstp = 0;
         int nsstp = 0;
         int ncstp = 0;

         if(ocsp - prices[i] > obsp){
            nbstp = ocsp - prices[i];
         } else {
            nbstp = obsp;
         }

         if(obsp + prices[i] > ossp){
            nsstp = obsp + prices[i];
         } else {
            nsstp = ossp;
         }

         if(ossp > ocsp){
            ncstp = ossp;
         } else {
            ncstp = ocsp;
         }

         obsp = nbstp;
         ossp = nsstp;
         ocsp = ncstp;
      }

      System.out.println(Math.max(ossp, ocsp));
   }

}


                        
    

