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
public class reverseKthELementOfQueue__ {

    public static void main(String[] args) {
    
         Queue<Integer> q= new LinkedList<>();
         
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        
        int k=3;
        modifyQueue(q,k);
        
         //result should be { 3 2 1 4 5}
    }
    
    public static void modifyQueue(Queue<Integer> q, int k)
    {
      //add code here.
      Stack<Integer> s = new Stack<>();
      for(int i = 0 ; i < k; i++){
          s.push(q.poll());
      }
      int size = q.size();
     // System.out.println(size+", "+s);
      while(!s.isEmpty()){
          q.add(s.pop());
      }
      for(int i = 0; i < size; i++){
          q.add( q.poll());
      }
      
      
      while(!q.isEmpty()){
          System.out.print(q.remove()+ " ");
      }
    }
}
