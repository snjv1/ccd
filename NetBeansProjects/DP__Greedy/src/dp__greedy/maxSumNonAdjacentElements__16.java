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
public class maxSumNonAdjacentElements__16 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        /*
        
        6       N
        5
        10
        10
        100
        5
        6
        
        output      = 116
        */
        int[] arr= new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        
        int oldInc =arr[0];
        int oldExc = 0;
        
        for(int i=1; i<arr.length; i++)
        {
            int newInclude= oldExc + arr[i];
            int newExclude=  Math.max( oldInc , oldExc);
            
            oldInc=newInclude;
            
            oldExc= newExclude;
            
        }
        
        System.out.println(Math.max(oldInc , oldExc));
        
    }
    
}
