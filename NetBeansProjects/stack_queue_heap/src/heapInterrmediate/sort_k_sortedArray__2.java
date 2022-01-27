 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapInterrmediate;

import java.util.PriorityQueue;

/**
 *
 * @author sanje
 */
public class sort_k_sortedArray__2 {
    public static void main(String[] args) {
        
        int arr[]= {3,2,4,1,6,5,7,9,8};
        int k=3;
        
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        for(int i=0;i<=k;i++)
        {
            pq.add(arr[i]);
        }
        
        for(int i=k+1; i<arr.length;i++)
        {
            System.out.println(pq.remove());
            pq.add(arr[i]);
        }
        
        while(pq.size()>0)
        {
            System.out.println(pq.remove());
        }
    }
}
