/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecusrsionInArray;

import java.io.*;

/**
 *
 * @author sanje
 */
public class maxOfArray_1 {
    public static void main(String[] args) throws Exception {
        
        /*
        6  total no of elements
        15
        30
        40
        4
        11
        9
        */
        
           BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];

      for (int i = 0; i < n; i++) {
         arr[i] = Integer.parseInt(br.readLine());
      }

      int max = maxOfArray(arr, 0);
      System.out.println(max);
    }
    public static int maxOfArray(int[] arr, int idx) 
    {
        if(idx == arr.length-1)
        {
            return arr[idx];
        }
        
        int max= maxOfArray(arr,idx+1);
        if(max>arr[idx])
        {
            return max;
        }
        else
            return arr[idx];
        
    }
}
