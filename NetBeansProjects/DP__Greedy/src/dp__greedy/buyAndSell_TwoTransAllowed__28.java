/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dp__greedy;

import java.io.*;

/**
 *
 * @author sanje
 */
public class buyAndSell_TwoTransAllowed__28 {
    public static void main(String[] args) throws Exception{
        
        /*
        9       N
        11
        6
        7
        19
        4
        1
        6
        18
        4
        
        output  30
        */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int misf = arr[0];
      int[] ps = new int[arr.length];
      for(int i = 1; i < arr.length; i++){
         if(arr[i] < misf){
            misf = arr[i];
         }

         if(arr[i] - misf > ps[i - 1]){
            ps[i] = arr[i] - misf;
         } else {
            ps[i] = ps[i - 1];
         }
      }
      
      
      
      

      int masf = arr[arr.length - 1];
      int[] pb = new int[arr.length];
      for(int i = arr.length - 2; i >= 0; i--){
         if(arr[i] > masf){
            masf = arr[i];
         }

         if(masf - arr[i] > pb[i + 1]){
            pb[i] = masf - arr[i];
         } else {
            pb[i] = pb[i + 1];
         }
      }

      int mp = Integer.MIN_VALUE;
      for(int i = 0; i < arr.length; i++){
         if(ps[i] + pb[i] > mp){
            mp = ps[i] + pb[i];
         }
      }

      System.out.println(mp);
   }

}


                        
        
    