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
public class Friends_Pairing__22 {
    
    public static void main(String[] args) {
        
        /*
        1. You are given a number n, representing the number of friends.
        2. Each friend can stay single or pair up with any of it's friends.
        3. You are required to print the number of ways in which these friends can stay single or pair up.
        E.g.
        1 person can stay single or pair up in 1 way.
        2 people can stay singles or pair up in 2 ways. 12 => 1-2, 12.
        3 people (123) can stay singles or pair up in 4 ways. 123 => 1-2-3, 12-3, 13-2, 23-1.
        
        INPUT  4
        OUTPUT 10
        */
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();        // total no friends
        
        int[] dp = new int[n+1];
        
        dp[1]=1;     // 1 friend h to 1 hi trika h 
        dp[2]=2;    // 2 friend h to 2 hi trika h 
        
        for(int i=3; i<=n; i++)
        {
            dp[i]= dp[i-1] + dp[i-2]*(i-1);
        }
        System.out.println(dp[n]);
    }
}
