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
public class hcf_LCF_Eculid_Algo {
    public static void main(String[] args) {
        int a=2, b =19;
        System.out.println(gcd(a,b));
        
        System.out.println(lcm(a,b));
    }
    
    static int gcd(int a, int b)
    {
        
        if(a==0)
        {
            return b;
        }
        return gcd(b%a,a);
    }
    
    static int lcm(int a, int b)
    {
        return (a*b)/gcd(a,b);
    }
    
}
