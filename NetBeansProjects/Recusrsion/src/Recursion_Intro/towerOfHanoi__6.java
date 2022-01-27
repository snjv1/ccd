/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion_Intro;

import java.util.Scanner;

/**
 *
 * @author sanje
 */
public class towerOfHanoi__6 {
    public static void main(String[] args) {
        
        /*
        A number n, representing number of disks
        A number n1, representing id of tower 1
        A number n2, representing id of tower 2
        A number n3, representing id of tower 3
        */
        
        
        /*
            3  N no of disck
            10   tower 1
            11      tower 2
            12      tower 3 
        */
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();  // no of disk
        
        int Tid1= sc.nextInt();
        int Tid2= sc.nextInt();
        int Tid3= sc.nextInt();
        
        
        
        toh(n,Tid1,Tid2,Tid3);
        
    }
    
   public static void toh(int n, int t1id, int t2id, int t3id)
   {
       if(n==0)
           return;
       
       toh(n-1,t1id,t3id,t2id);// will print the instruction to move n-1 from t1 to t3 using t2
       System.out.println(n+"["+ t1id + " -> " + t2id + "]");
       toh(n-1,t3id,t2id,t1id);
       
    }
}
