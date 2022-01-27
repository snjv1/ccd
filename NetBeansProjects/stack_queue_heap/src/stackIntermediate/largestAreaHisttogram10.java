package stackIntermediate;

import java.util.Stack;

public class largestAreaHisttogram10 
{
    public static void main(String[] args) {
        
        int arr[] = {4,2,0,3,2,5}; //{6,2,5,4,5,1,6};
        
        
        //rb and lb m hmm index stores krenge or unhe hi usse krenge calculation of width ke liye
        int rb[] =new int[arr.length];            // next smallest on the right
        
        Stack<Integer> st= new Stack<>();
        st.push(arr.length-1);                   //last element ka index stack m daal diya 
        rb[arr.length-1]= arr.length;           /* last element ke liye usse chota element nhi hoga uske right m to 
                                                according to qtn hm arr ki length ko lenge smaalest element  
                                                    and  JISKA SMALLEST NHI HOGA USKE LIYE BHI ARRAY ki LENGTH lenge default*/
        
        // right to left approach use krenge isme
        for(int i=arr.length-2; i>=0; i--)
        {
            while(st.size()>0 && arr[i] <=arr[st.peek()])
            {
                st.pop();
            }
            if(st.size()==0)
            {
                rb[i]=arr.length;                      // default use krenge kuki jinka nhi h unke liye
            }
            else
            {
                rb[i]=st.peek();
            }
            
            st.push(i);
                
        }
        
        
        
        int lb[]=new int[arr.length];            // next smallest element to left
        
        st= new Stack<>();
        st.push(0);                   //first element ka index stack m daal diya 
        lb[0]= -1;           /* first element ke liye usse chota element nhi hoga uske left m to 
                                                according to qtn hm -1 ko lenge smaalest element  
                                                    and  JISKA SMALLEST NHI HOGA USKE LIYE BHI -1 lenge default*/
        
        // left to right wali approach use krenge isme 
        for(int i=1; i<arr.length; i++)
        {
            while(st.size()>0 && arr[i] <=arr[st.peek()])
            {
                st.pop();
            }
            if(st.size()==0)
            {
                lb[i]=-1;         //-1 default lenge jinka smallest nhi h
            }
            else
            {
                lb[i]=st.peek();
            }
            
            st.push(i);
                
        }
        
        for(int i=0; i<rb.length; i++)
        {
            System.out.print(rb[i]+"");
        }
        System.out.println();
        for(int i=0; i<lb.length; i++)
        {
            System.out.print(lb[i]+"");
        }
        
        int maxArea =0 ;
        for(int i=0;i<arr.length;i++)
        {
            int width= rb[i]- lb[i] -1;
            int area = arr[i] * width;
            
            if(area>maxArea)
                maxArea=area;
        }
        
        System.out.println("max area of histogram is " + maxArea);
            
    }
    
}
