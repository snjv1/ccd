/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackIntermediate;

import java.util.Stack;

/**
 *
 * @author sanje
 */
public class nextsmallerElement__toRight3 
{
    
    
    static int[] solution(int arr[])
    {
        int nsm[] = new int[arr.length];
        Stack<Integer> st= new Stack<>();
        
        // used  **001** used to define no smaaler element is found for no
        st.push(arr[arr.length-1]);
        nsm[arr.length-1]=00;
        
        
        for(int i=arr.length-2; i>=0 ;i--)
        {
            while(st.size() >0 && arr[i] < st.peek())
            {
                st.pop();
            }
            
            if(st.size()==0)
            {
                nsm[i]=00;  
            }
            else
            {
                nsm[i]=st.peek();
            }
            
            st.push(arr[i]);
        }
        
        
    
        return nsm;
    }
    
    
    public static void main(String[] args) {
        
        int arr[] = {2,5,9,3,1,12,6,8,7};
        
        int result[] = solution(arr);
        
        for(int i=0;i<result.length;i++)
        {
            System.out.println( result[i]+" ");
        }
    }
}

