package queueIntermediate;

import java.util.*;

public class reverseQueueUsingRecursion_3 {
    public static void main(String[] args) {
        
        Queue<Integer> q= new LinkedList<>();
         
        q.add(4);
        q.add(3);
        q.add(1);
        q.add(10);
        q.add(2);
        q.add(6);
        
        
        reverse(q);
        
         while(!q.isEmpty())
        {   
            System.out.print(q.remove() +" ");
        }
        
    }
    
    static void reverse(Queue<Integer> q)
    {
        if(q.isEmpty())
            return;
        else
        {
            int a= q.remove();
            reverse(q);
            
            q.add(a);
        }
    }
}
