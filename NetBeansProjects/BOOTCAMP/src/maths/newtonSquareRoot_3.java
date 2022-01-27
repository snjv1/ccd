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
public class newtonSquareRoot_3 {
    public static void main(String[] args) {
        
        int n =40;
        System.out.println(newtonSqrt(n));
    }
    
    static double newtonSqrt(int n)
    {
        double root, x=n;
        
        while(true)
        {
            root= 0.5 * (x + (n/x));
            
            if(Math.abs(root-x)< 1)
            {
                break;
            }
            
            x =root;        
        }
        return root;
    }
    
}
