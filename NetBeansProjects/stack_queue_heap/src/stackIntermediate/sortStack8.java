/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackIntermediate;

import java.util.ListIterator;
import java.util.Stack;

/**
 *
 * @author sanje
 */
public class sortStack8 
{
    public static void main(String[] args) 
    {
        Stack<Integer> st = new Stack<>();
        st.push(30);
        st.push(-5);
        st.push(18);
        st.push(14);
        st.push(-3);
       
        sortstack(st);
        
        
        while(!st.isEmpty())
        {
            System.out.println( st.pop());
        }
        
        
    }
    
    static void sortstack(Stack<Integer> st)
    {
        if(!st.isEmpty())
        {
            int x=st.pop();
            sortstack(st);
            
            sortedInsert(st,x);
        }
    }
    
    static void sortedInsert(Stack<Integer> st ,int x)
    {
     
        if(st.isEmpty() || x>st.peek())
        {
            st.push(x);
            return;
        }
        
        int temp=st.pop();
        sortedInsert(st,x);
        
        st.push(temp);
    }
    
}
