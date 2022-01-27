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
public class paintHouseManyColors__18 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int n = Integer.parseInt(line.split(" ")[0]);
        int k = Integer.parseInt(line.split(" ")[1]);
        
        /*
        1. You are given a number n and a number k separated by a space, representing the number of houses and number of colors.
        2. In the next n rows, you are given k space separated numbers representing the cost of painting nth house with one of the k colors.
        3. You are required to calculate and print the minimum cost of painting all houses without painting any consecutive house with same color.
        */
        
        /*
        4 3       //no of house  ttypes of color
        1 5 7
        5 8 4
        3 2 9
        1 2 4
        
        */
        int[][] arr = new int[n][k];
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            String[] items = str.split(" ");
            for(int j = 0; j < k; j++){
                arr[i][j] = Integer.parseInt(items[j]);
            }
        }

        int[][] dp= new int[arr.length][arr[0].length];
        
        int min = Integer.MAX_VALUE;
        int smin = Integer.MAX_VALUE;
        for(int j = 0; j < arr[0].length; j++)
        {
            if(arr[0][j] <= min){
                smin = min;
                min = arr[0][j];
            } else if(arr[0][j] <= smin){
                smin = arr[0][j];
            }
        }

        for (int i = 1; i < dp.length; i++) {
            int cmin = Integer.MAX_VALUE;
            int csmin = Integer.MAX_VALUE;

            for(int j = 0; j < dp[i].length; j++){
                if(dp[i - 1][j] == min)
                {
                    dp[i][j] = arr[i][j] + smin;
                }
                else 
                {
                    dp[i][j] = arr[i][j] + min;
                }

                if(dp[i][j] <= cmin){
                    csmin = cmin;
                    cmin = dp[i][j];
                } 
                else if(dp[i][j] <= csmin)
                {
                    csmin = dp[i][j];
                }
            }

            min = cmin;
            smin = csmin;
        }

        System.out.println(min);
    }
}


                        


                        