package stackIntermediate;

import java.util.Stack;


//https://www.youtube.com/watch?v=rSf9vPtKcmI&t=601s
//https://www.youtube.com/watch?v=rSf9vPtKcmI&t=601s//

public class nextGreaterElement_toRight_3 
{
   /* 
    1 stack m oth postion daal do na ki oth element
    2 arr i th element ko or stack ki oeek positn ka element array m se compare krlo 
    3 last m jo element ast m rh gye unhe -1 daal do
      
    */
    
    // 1st approach
    // traversal  approach from right to left side
    static int[] solution__1(int arr[])
    {
        int nge[] = new int[arr.length];
        Stack<Integer> st= new Stack<>();
        
        // used  **001** used to define no smaaler element is found for no
        st.push(arr[arr.length-1]);
        nge[arr.length-1]=-1;
        
        
        for(int i=arr.length-2; i>=0 ;i--)
        {
            while(st.size() >0 && arr[i] >= st.peek())
            {
                st.pop();
            }
            
            if(st.size()==0)
            {
                nge[i]=-1;  
            }
            else
            {
                nge[i]=st.peek();
            }
            
            st.push(arr[i]);
        }
        
        
    
        return nge;
    }
    
    
    
    
    // 2nd approach 
    /*  traversal  approach from left to right side
    
    */
    static int[] solution(int arr[])
    {
        int nge[] = new int[arr.length];
        Stack<Integer> st= new Stack<>();
        
        st.push(0);
        
        for(int i=1; i <arr.length;i++)
        {
           
            while(st.size()>0 && arr[i]>arr[st.peek()])
            {
                int pos=st.peek();
                nge[pos]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        while(st.size()>0)
        {
            int pos=st.peek();
            nge[pos]=-1;
            st.pop();
        }
        
        
    
        return nge;
    }
    
    
    public static void main(String[] args) {
        
        int arr[] = {2,5,9,3,1,12,6,8,7};
        
        int result[] = solution__1(arr);
        
        for(int i=0;i<result.length;i++)
        {
            System.out.println( result[i]+" ");
        }
    }
}

