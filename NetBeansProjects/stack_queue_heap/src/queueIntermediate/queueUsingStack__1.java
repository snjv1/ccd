/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueIntermediate;

import java.util.Stack;

/**
 *
 * @author sanje
 */
public class queueUsingStack__1 
{
    static int val=0;
    static  Stack<Integer> main = new Stack<Integer>();
    static Stack<Integer> helper = new Stack<Integer>();
    
    public static void main(String[] args) {
       
        

   
    
    }
    //Function to push an element in queue by using 2 stacks.
   static void Push(int x)
    {
	 while(main.size()>0)
         {
             helper.push(main.pop());
         }
         
         main.push(x);
         
         while(helper.size()>0);
         {
             main.push(helper.pop());
         }
    }
	
   
   static int remove()
   {
       if(main.size()==0)
       {
           System.out.println("queue underflow");
           return -1;
       }
       else
           return main.pop();
   }
    
    //Function to pop an element from queue by using 2 stacks.
   static int peek()
    {
      if(main.size()==0)
       {
           System.out.println("queue underflow");
           return -1;
       }
       else
           return main.peek();
	   
    }
   
     
        
}
