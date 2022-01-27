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
public class powerOfNumber__4 {
    public static void main(String[] args) {
        
        int x=2;
        int n=5;
        
        int res1=power1(x,n);
        System.out.println(res1);
        
        int res2=power2(x,n);
        System.out.println(res2);
        
        
    }
    // more good quality code than power2 
    public static int power1(int x , int n)
    {
        if(n==0)
            return 1;
        int xpnb= power1(x,n/2);
        int xn = xpnb * xpnb;
        
        if(n%2==1)
            xn=xn*x;
        
        return xn;
        
    }
    
    
    public static int power2(int x , int n)
    {
        if(n==0)
            return 1;
        
        int nm1= power2(x,n-1);
        int re =x*nm1;
        
        return re;
                
    }
    
}
