/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.*;

/**
 *
 * @author sanje
 */
public class cycle_Sort {
    public static void main(String[] args) {
        
       HashMap<Integer,Integer> map = new HashMap<>();
       int[] arr = {1,2,2,1,3,4,2,5,5,8};
       for(int i : arr)
       {
           map.put(i, map.getOrDefault(i,0)+1);
       }
       for(Map.Entry ss : map.entrySet())
       {
           int n = (int)ss.getValue();
           if(n>=2)
           {
               System.out.println(ss.getKey());
           }
       }
       // int arr[]={4,3,2,7,8,2,3,1};
        //sort(arr);
        //System.out.println(Arrays.toString(arr));
      
    }
    static void sort(int[] arr)
    {
        int i=0;
        while(i<arr.length)
        {
            int correct=arr[i]-1;
            if( arr[i] != arr[correct])
            {
                arr[i]=arr[i]+arr[correct]-(arr[correct]=arr[i]);
            }
            else
            {
                i++;
            }
        }
    }
    
}
