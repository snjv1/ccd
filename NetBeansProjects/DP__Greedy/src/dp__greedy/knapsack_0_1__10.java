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
public class knapsack_0_1__10 {
    
    public static void main(String[] args) throws Exception 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        
        
        /*
        5       N
        15 14 10 45 30      // prices
        2 5 1 3 4           // weight
        7                   // capacity
        
        output      // max price is 75  under weight capacity 7
        
        */
        int[] prices = new int[n];
        String str1 = br.readLine();
        for (int i = 0; i < n; i++) {
            prices[i] = Integer.parseInt(str1.split(" ")[i]);
        }

        int[] wts = new int[n];
        String str2 = br.readLine();
        for (int i = 0; i < n; i++) {
            wts[i] = Integer.parseInt(str2.split(" ")[i]);
        }

        int cap = Integer.parseInt(br.readLine());
        
        int[][] dp = new int[n+1][cap+1];
        for(int i=1; i<dp.length; i++)
        {
            for(int j=1; j<dp[0].length; j++)
            {
                int weight = wts[i-1];
                int price = prices[i-1];
                
                if(j >= weight)     // jb ball jada ho player ki ball khelne ki capacity se
                {
                    dp[i][j]= Math.max( dp[i-1][j],  dp[i-1][j-weight]+price);     // jo bhi max hoga vo asn hoga
                                                                                    //  dp[i-1][j]             jb player nhi khelta to sirf uski team ke run
                                                                                     // dp[i-1][j-weight]+price     jb plaayer khelta h to uske run + bacche hue uski team ke run (mtlb picche wale)  + 
                }
                else            //jb ball kmm  ho player ki ball khelne ki capacity se      //// jse player 3 ball km se km khel skta h prr use khelne ko 1 ball mile to vo nhi khelega
                {
                    dp[i][j]= dp[i-1][j];               // vo apni team ko khelne dega ((mtlb upr wala column uska ans hoga))
                }
            }
        }
        
        System.out.println(dp[n][cap]);

        
        
    }
}
