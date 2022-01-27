/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackIntermediate;

import java.util.*;

/**
 *
 * @author sanje
 */
public class reverseStackUsingRecursion7 
{
   
    public static void main(String[] args) 
    {
        Stack<Integer> st= new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        
        int size=st.size();
        reverse(st);
        
         while(!st.isEmpty())
        {   
            System.out.println(st.pop());
        }
        
        
    }
    
    static void reverse(Stack<Integer> st)
    {
        if(!st.isEmpty())
        {
            int a=st.pop();
            reverse(st);
            insert_at_bottom( st,a);
        }
    }
    
    
    static void insert_at_bottom(Stack<Integer> st,int x)
    {
    if(st.isEmpty())
        st.push(x);
    else
    {
        /* All items are held in Function Call Stack until we
           reach end of the stack. When the stack becomes
           empty, the st.size() becomes 0, the
           above if part is executed and the item is inserted
           at the bottom */
        int b = st.pop();
        insert_at_bottom( st,x);
        //push all the items held in Function Call Stack
        //once the item is inserted at the bottom
        st.push(b);
    }
    }   
}
