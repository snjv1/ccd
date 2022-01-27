package sorting;

import java.util.Arrays;
import java.util.Scanner;

public class targetSumPair__11 
{
    public static void main(String[] args) 
    {
        Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for(int i = 0 ;i < n; i++){
      arr[i] = scn.nextInt();
    }
    int target = scn.nextInt();
    
    targetSumPair(arr,target);
        
    }
    
    
    public static void targetSumPair(int[] arr,int target)
    {
        
    Arrays.sort(arr); // nlogn n
    
    //while m array ko ek baar traverse kr rhe h  so n time  total complexity is   n + nlogn = nlogn
    int left = 0, right = arr.length - 1;
    while(left < right)
    {
      if(arr[left] + arr[right] < target)
      {
        left++;
      }
      else if(arr[left] + arr[right] == target)
      {
        System.out.println(arr[left] + ", " + arr[right]);
        left++;
        right--;
      }
      else
      {
        right--;
      }
    }
    
    }
}
