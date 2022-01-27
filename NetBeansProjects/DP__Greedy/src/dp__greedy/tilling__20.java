/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp__greedy;

import java.util.Scanner;

/**
 *
 * @author sanje
 */
public class tilling__20 {
    public static void main(String[] args) {
        
        /*
        1. You are given a number n representing the length of a floor space which is 2m wide. It's a 2 * n board.
        2. You've an infinite supply of 2 * 1 tiles.
        3. You are required to calculate and print the number of ways floor can be tiled using tiles.
        
        INPUT  8
        OUTPUT 34
        */
        
        Scanner sc= new Scanner(System.in);
        
        int n =sc.nextInt();
        
        int[] dp =new int[n+1];
        
        dp[1]=1;    //  1 tile se floor cover krne ka 1 trika
        dp[2]=2;    //  2 tile se floor cover krne ke 2 trika
        
        for(int i=3; i<=n; i++)
        {
            dp[i]=dp[i-1] + dp[i-2];
        }
        
        System.out.println("Total ways for tilling floor is " + dp[n]);
        
        
    }
    
}
