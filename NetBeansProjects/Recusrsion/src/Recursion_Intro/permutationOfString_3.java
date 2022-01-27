/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion_Intro;

/**
 *
 * @author sanje
 */
public class permutationOfString_3 {
 
    public static void main(String[] args) {
        
        String str="abc";
        int n=str.length();
        int f = factorial(n);
        
        
        for(int i=0; i<f ; i++)
        {
            StringBuilder sb = new StringBuilder(str);
            int temp=i;
            for(int div=n ; div>=1; div--)
            {
                int q= temp/div;
                int r= temp%div;
                
                System.out.print(sb.charAt(r));
                sb.deleteCharAt(r);
                
                temp=q;
            }
            
            System.out.println();
        }
    }
    public static int factorial(int n)
    {
        if(n==1)
            return 1;
        int mione=factorial(n-1);
        int one=mione*n;
        return one;
            
    }
}
