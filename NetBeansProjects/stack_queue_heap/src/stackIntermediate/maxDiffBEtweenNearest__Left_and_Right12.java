/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackIntermediate;

import java.util.Scanner;
import java.util.Stack;
/*
Input : arr[] = {2, 1, 8}
Output : 1
Left smaller  LS[] {0, 0, 1}
Right smaller RS[] {1, 0, 0}
Maximum Diff of abs(LS[i] - RS[i]) = 1 

Input  : arr[] = {2, 4, 8, 7, 7, 9, 3}
Output : 4
Left smaller   LS[] = {0, 2, 4, 4, 4, 7, 2}
Right smaller  RS[] = {0, 3, 7, 3, 3, 3, 0}
Maximum Diff of abs(LS[i] - RS[i]) = 7 - 3 = 4 

Input : arr[] = {5, 1, 9, 2, 5, 1, 7}
Output : 1


*/
public class maxDiffBEtweenNearest__Left_and_Right12 {
    public static void main(String[] args) {
       
	
	Scanner sc= new Scanner(System.in);

        int a[]={2, 4, 8, 7, 7, 9, 3};
        
	    int lb[] = new int[a.length];
	    int rb[]=new int[a.length];
	    
	    Stack<Integer> st = new Stack<>();
	    rb[a.length-1]=0;
	    st.push(a[a.length-1]);
	    
	    for(int i=a.length-2; i >=0 ;i--)
	    {
	        while(st.size()>0 &&  a[i] < st.peek())
	        {
	            st.pop();
	        }
	        if(st.size()==0)
	            rb[i]=0;
            else
            {
                rb[i]=st.peek();
            }
            
            st.push(a[i]);
	    }
	    
	    
	    st = new Stack<>();
	    lb[0]=0;
	    st.push(a[0]);
	    
	    for(int i=1; i<a.length;i++)
	    {
	        while(st.size()>0 &&  a[i] < st.peek())
	        {
	            st.pop();
	        }
	        if(st.size()==0)
	            lb[i]=0;
            else
            {
                lb[i]=st.peek();
            }
            
            st.push(a[i]);
	    }
	    
	    
            
            int maxDiff=0;
	    for(int i=0 ; i<=a.length-1; i++)
	    {
	        int diff= lb[i] - rb[i] ;
	        if(diff > maxDiff)
	        {
	            maxDiff=diff;
	        }
	    }
            
            System.out.println(maxDiff);
	    
	}
	
	
    }






