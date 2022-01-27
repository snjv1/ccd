/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackIntermediate;

import java.util.Stack;


/*
for the array [2 5 9 3 1 12 6 8 7]
span for 2 is 1
span for 5 is 2           // 5 se bda koi nhi h left m to index of 5 + 1
span for 9 is 3
span for 3 is 1          // 3 se bda left m 9 h to 3 ka index - 9 ka index 
span for 1 is 1
span for 12 is 6
span for 6 is 1
span for 8 is 2
span for 7 is 1
*/

// greater to left ka same hi logic rhega lgg bhag
// 
public class stockSpan_GreaterTO__LEFT_3 
{
    public static void main(String[] args) 
    {
         int arr[] = {2,5,9,3,1,12,6,8,7};
        
        int result[] = solution(arr);
        
        for(int i=0;i<result.length;i++)
        {
            System.out.println( result[i]+" ");
        }
    } 
    
    static int [] solution(int[] array)
    {
        int span[] = new int[array.length];
        
        Stack<Integer> st= new Stack<>();
        span[0]=1;
        st.push(0);
        
        for(int i=1; i <array.length;i++)
        {
            while(st.size()>0 && array[i] > array[st.peek()])
            {
                st.pop();
            }
            if(st.size()==0)
            {
                span[i]=i+1;
            }
            else
            { 
                span[i]=i-st.peek();
            }
            
            st.push(i);
        }
        
        return span;
    }

    
    
    
}
