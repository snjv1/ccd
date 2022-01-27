/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecusrsionInArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author sanje
 */
public class firstIndex_3 {
    public static void main(String[] args) throws Exception{
        
        /*
            6           N   
            15
            11
            40
            4
            4
            9
            4           X
        */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int[] arr= new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        
        int x= Integer.parseInt(br.readLine());
        
        int result =firstIndex(arr,0,x);
        System.out.println("");
        System.out.println(result);
        
    }
    
   public static int firstIndex(int[] arr, int idx, int x){
        
       if(idx==arr.length)
           return -1;
       
       
       if(arr[idx]==x)
       {
           return idx;
       }
       else
       {
           int max=firstIndex(arr,idx+1,x);
           return max;
       }
    }

}