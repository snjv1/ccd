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
public class squareRoot {
    public static void main(String[] args) {
        
        int n=40;
        int p=3;
        
        System.out.println(sqrt(n,p));
        System.out.printf("%.3f" , sqrt(n,p));
        
        
    }
    
    static double sqrt(int n, int p)
    {
        int s=0,e=n;
        double root = 0.0;
        
        
       // for perfect square        
        while(s<=e)
        {
            int mid= s+ (e-s)/2;
            
            if(mid*mid == n)
            {
                return mid;
            }
            else if(mid*mid < n)
            {
                s= mid+1;
            }
            else
            {
                e=mid-1;
            }
        }
        
        
        // for precision
        
        double incr= 0.1;
        for(int i=0; i<p; i++)
        {
            while(root *root <=n){
                root +=incr;
            }
            
            root -= incr;
            incr /=10;
        }
        
        
        return root;
    }
    
}
