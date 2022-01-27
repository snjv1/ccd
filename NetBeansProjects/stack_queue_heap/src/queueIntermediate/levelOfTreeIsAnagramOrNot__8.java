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
public class levelOfTreeIsAnagramOrNot__8 {
    public static void main(String[] args) {
        
        
         Node root1 = new Node(1);
        root1.left = new Node(3);
        root1.right = new Node(2);
        root1.right.left = new Node(5);
        root1.right.right = new Node(4);
       
        Node root2 = new Node(1);
        root2.left = new Node(2);
        root2.right = new Node(3);
        root2.left.left = new Node(4);
        root2.left.right = new Node(5);
        
        System.out.println(areAnagram(root1,root2));
        
        
        
        
    }
    
      static class Node
    {
        Node left, right;
        int data;
        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
      
      
      static boolean areAnagram(Node root1, Node root2)
      {
          if(root1==null && root2==null)
              return true;
          if(root1==null || root2==null)
              return false;
          
         Queue<Node> q1 = new LinkedList<Node>();
        Queue<Node> q2 = new LinkedList<Node>();
        
        q1.add(root1);
        q2.add(root2);
        
        
        while(true)
        {
            
            int n1=q1.size() ,n2=q2.size();
            
            if(n1!=n2)                                    // check at every level of tree
                return false;
            if(n1==0)
                break;
            
            ArrayList<Integer> list1= new ArrayList<>();
            ArrayList<Integer> list2= new ArrayList<>();
            
            while(n1-->0)
            {
                Node temp1= q1.remove();
                list1.add(temp1.data);
                
                if(temp1.left!=null)
                    q1.add(temp1.left);
                if(temp1.right!=null)
                    q1.add(temp1.right);
            
                Node temp2= q2.remove();
                list2.add(temp2.data);
                
                if(temp2.left!=null)
                    q2.add(temp2.left);
                if(temp2.right!=null)
                    q2.add(temp2.right);
            
                
            }
            
            Collections.sort(list1);
            Collections.sort(list2);
            
            if(!list1.equals(list2))
                return false;
            
        }
        
        return true;
          
      }
    
}
