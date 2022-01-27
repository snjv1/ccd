package heapInterrmediate;

import java.util.*;

public class K_LArgestElementInArrray__1 
{
    public static void main(String[] args) 
    {
        int array[]={13,12,62,22,15,37,99,11,37,98,67,31,84,99};
        int k=4;
        
       PriorityQueue<Integer> pq= new PriorityQueue<>();
       for( int i=0; i<array.length;i++)
       {
           if(i<k)
           {
               pq.add(array[i]);
           }
           else
           {
               if(array[i]>pq.peek())
               {
                   pq.remove();
                   pq.add(array[i]);
               }
           }
       }
       while(pq.size()>0)
       {
        System.out.println(pq.remove());
       }
       
        
    }
}
