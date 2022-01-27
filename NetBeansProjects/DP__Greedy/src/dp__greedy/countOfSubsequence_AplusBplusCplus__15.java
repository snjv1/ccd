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
public class countOfSubsequence_AplusBplusCplus__15 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        
        /*
        input == abcabc
        output ==7 
        
        For abbc -> there are 3 subsequences. abc, abc, abbc
        For abcabc -> there are 7 subsequences. abc, abc, abbc, aabc, abcc, abc, abc.
        */
        
        int a=0; 
        int ab=0; 
        int abc=0; 
        
        for(int i=0; i<str.length(); i++)
        {
            char ch= str.charAt(i);
            
            if(ch=='a'){
                a=2*a+1;
            }
                
            else if(ch=='b')
            {
                ab = 2*ab + a;
            }
            else if(ch=='c')    
            {
                abc = 2*abc + ab;
            }
        }
        
        System.out.println(abc);
    }
}
