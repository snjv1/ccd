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
public class targetSumSubset__6 
{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        int n =sc.nextInt();
        
        /*
        5       N
        4
        2
        7
        1
        3
        10      TARGET
        output   terget jitna kisi subset ka sum h ya nhi 
        */
        
        int[] arr= new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int target =sc.nextInt();
        
        boolean[][] dp = new boolean[n+1][target+1];
        
        for(int i=0; i<dp.length; i++)
        {
            for(int j=0; j<dp[0].length; j++)
            {
                if(i==0 && j==0)   // blank array ka subset sirf 0 ho skta h
                {
                    dp[i][j]=true;
                }
                
                else if(i==0)        //blank array ka subset ka sum 0 ka alawa kuch nhi ho skta
                {
                    dp[i][j]=false;
                }
                
                else if(j==0)       // hrr array ka subset ka sum 0 ho skta h
                {
                    dp[i][j]=true;
                }
                
                else
                {
                    if(dp[i-1][j]== true)        // phle uske upr wale p check krenge ki vo tick h ya nhi    //agr wo player nhi khelta h or dekhta h ki uski team akela jth column jitne run bna skti h to vo bhi pass ho jaeyga
                    {
                        dp[i][j]=true;
                    }
                    
                    else                        //upr column p tick nhi h to abb piche wale column p check krenge      //abb player  ko khelna pdega 
                    {
                        int val = arr[i-1];  //dp ki row m kn sa element(plater) h vo dekh rhe h but original array m dp se ek index km h to i-1 index p check krenge
                        if( j>= val) // jo bhi player aa rha h vo km  se km jth column jitne run akela bna skta ho taki bacche hue uski team bna ske
                        {
                            if(dp[i-1][j-val]==true) // uski team bacche hue run agr bna leti h to vo sb pass ho jaeynge 
                            {
                                dp[i][j]=true;
                            }
                        }
                    }
                }
            }
        }
        
        
        System.out.println(dp[arr.length][target]);
        // mtlb agr target jitna agr koi subset h to true return kr dega 
        
        
    }
    
}
