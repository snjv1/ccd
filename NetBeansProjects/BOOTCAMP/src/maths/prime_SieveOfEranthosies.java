/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maths;

/**
 *
 * @author sanje
 */
public class prime_SieveOfEranthosies {
    public static void main(String[] args) {
        int n=40;
    boolean[] arr=  new boolean[n+1];
    
    sieve(n,arr);    
    }
    
    static void sieve(int n ,boolean[] arr){
        for(int i=2; i*i<=n; i++)
        {
            if(arr[i]==false)
            {
                for(int j =i*2; j<=n ; j=j+i)
                {
                    arr[j]=true;
                }
            }
        }
        
        for(int i=2; i<=n;i++){
            if(arr[i]==false)
            {
                System.out.println(i);
            }
        }
    }
}
