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
public class buyAndSellStock_infiniteTranAllowed__25 
{
    public static void main(String[] args) throws Exception 
    {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
     
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
      
      output        30
      */
      int[] arr = new int[n];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int bon = 0;
      int son = 0;
      int op = 0;
      for(int i = 1; i < arr.length; i++){
         if(arr[i] < arr[i - 1]){
            op += arr[son] - arr[bon];
            bon = son = i;
         } else {
            son++;
         }
      }

      op += arr[son] - arr[bon];
      System.out.println(op);
   }

}


                        
