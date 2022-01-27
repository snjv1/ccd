/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting;

import java.util.Scanner;

/**
 *
 * @author sanje
 */
public class pivotInSortedAndRotatedArray__12 
{
    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int[] arr = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = scn.nextInt();
    }
    int pivot = findPivot(arr);
    System.out.println(pivot);
    }
    
    /*
    9       N
    15
    16
    19
    21
    23
    24
    1
    2
    12
    
    output smallest eement 1
    */
    
    public static int findPivot(int[] arr) 
    {
    int lo = 0;
    int hi = arr.length - 1;

    while (lo < hi) 
    {
        int mid = (lo + hi) / 2;
        if (arr[mid] < arr[hi])        // pivot will lie on left side
        {
            hi = mid;
        }
        else if (arr[mid] > arr[hi])     // pivot will lie on right side
        { 
            lo = mid + 1;
        } 
    }
        return arr[hi];
    }
}
