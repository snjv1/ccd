package queueIntermediate;

import java.util.*;

public class queueCanBeSorted__2 
{
    static Queue<Integer> q = 
                    new LinkedList<Integer>();
    
    public static void main(String[] args) 
    {
        
         q.add(5);
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
      
        int n = q.size();
  
        if (checkSorted(n))
            System.out.println("Yes");
        else
            System.out.println("No");
        
    }
    
    static boolean checkSorted(int n) 
    {
        int expected=1;
        int frnt;
        Stack<Integer> st= new Stack<>();
        
        
        while(q.size() !=0)
        {
            frnt=q.peek();
            q.poll();
            
            
            if(frnt == expected)
                expected++;
            
            else
            {
                if(st.size()==0)
                {
                    st.push(frnt);
                }
                
                else if(st.size()!=0 && st.peek() < frnt)
                    return false;
                
                else
                    st.push(frnt);
                
            }
            
            while(st.size()!=0 && st.peek() == expected)
            {
                st.pop();
                expected++;
            }
        }
        
        if(expected -1 == n && st.size()==0)
            return true;
        
        return false;
    }
    
}
