/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp__greedy;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author sanje
 */
public class paintHouse__17 {
    
    public static void main(String[] args) throws Exception {
        /*
        1. You are given a number n, representing the number of houses.
        2. In the next n rows, you are given 3 space separated numbers representing the cost of painting 
        nth
        house with 
        red or blue or green color.

        */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int n = Integer.parseInt(br.readLine());
        
        int[][] arr= new int[n][3];
        /*
        phle  red then  blue then green color.
        */
        
        /*
        4       houses
        1 5 7
        5 8 4
        3 2 9
        1 2 4
        
        output  8
        */
        for(int i=0; i<n; i++)
        {
            String[] items= br.readLine().split(" ");
            
            arr[i][0]=Integer.parseInt(items[0]);
            arr[i][1]=Integer.parseInt(items[1]);
            arr[i][2]=Integer.parseInt(items[2]);
        }
        
        
        long red=arr[0][0];
        long blue=arr[0][1];
        long green=arr[0][2];
        
        for(int i=1; i<n; i++)
        {
            long newRed =arr[i][0]  + Math.min(blue, green);  //new house ko red krna h to RED ki COST + piche wale ghr ki blue and green m se min cost  kuki abb ghr ko red krre h to picche wali red nhi hona chahiye green ya blue ho skta h
            long newBlue =arr[i][1]  + Math.min(red, green);
            long newGreen =arr[i][2]  + Math.min(blue, red);
            
            red= newRed;
            blue= newBlue;
            green= newGreen;
            
            
        }
        
        System.out.println(Math.min( red,  Math.min(blue, green)));   // 3 m se jo bhi min cost hogi us pattern m paint honge ghr
    }
    
}
