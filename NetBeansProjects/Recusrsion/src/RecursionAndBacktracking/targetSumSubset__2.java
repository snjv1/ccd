package RecursionAndBacktracking;

import java.util.Scanner;

public class targetSumSubset__2 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr= new int[n];
        
        for(int i=0; i<arr.length; i++)
        {
            arr[i]=sc.nextInt();
        }
        int targ= sc.nextInt();
        printTargetSumSubsets(arr,0,"",0,targ);
        
        
    }
    
      public static void printTargetSumSubsets(int[] arr, int idx, String set, int sos, int tar) 
      {
          if(sos>tar)
          {
              return;
          }
          if(idx==arr.length)
          {
              if(sos==tar)
              {
                  System.out.println(set +".");
              }
              return;
          }
     
          printTargetSumSubsets(arr, idx+1, set + arr[idx]+"," , sos+ arr[idx] ,tar);
          printTargetSumSubsets(arr, idx+1, set , sos ,tar);
    }

}
