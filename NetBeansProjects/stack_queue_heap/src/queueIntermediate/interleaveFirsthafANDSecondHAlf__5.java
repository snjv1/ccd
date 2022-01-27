/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueIntermediate;

import java.util.*;

/**
 *
 * @author sanje
 */
public class interleaveFirsthafANDSecondHAlf__5 {
    
    public static void main(String[] args) {
        
         Queue<Integer> q = new java.util.LinkedList<>();
    q.add(11);
    q.add(12);
    q.add(13);
    q.add(14);
    q.add(15);
    q.add(16);
    q.add(17);
    q.add(18);
    q.add(19);
    q.add(20);
    
    int N=q.size();
    interLeaveQueue(q);
    
    for (int i = 0; i<N; i++) 
    {
        System.out.print(q.peek() + " ");
        q.poll();
    }
    
    }
    static void interLeaveQueue(Queue<Integer> q)
    {
        Stack<Integer> st= new Stack<>();
        
        int N=q.size();
        
        
        if(N%2!=0)
            System.out.println("Input even no of integer");
       
          for( int i=0; i<N/2; i++)
          {
              st.push(q.remove());
          }
          
          while(!st.isEmpty())
          {
              q.add(st.pop());
          }
          
          for( int i=0; i<N/2; i++)
          {
              q.add(q.remove());
          }
          
           for( int i=0; i<N/2; i++)
          {
              st.push(q.remove());
          }
           
           while(!st.isEmpty())
           {
               q.add(st.pop());
               q.add(q.remove());
           }
          
        }
}