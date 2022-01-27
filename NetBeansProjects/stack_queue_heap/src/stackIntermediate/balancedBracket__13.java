package stackIntermediate;

import java.util.Stack;

public class balancedBracket__13 
{
    /*
    [(a + b) + {(c + d) * (e / f)}] -> true
[(a + b) + {(c + d) * (e / f)]} -> false
[(a + b) + {(c + d) * (e / f)} -> false
([(a + b) + {(c + d) * (e / f)}] -> false
    */
    public static void main(String[] args) 
    {
        String str= "[(a + b) + {(c + d) * (e / f)} ";       //-> false
        Stack<Character> st= new Stack<>();
        for(int i=0;i <str.length(); i++)
        {
            char ch= str.charAt(i);
            
            if(ch=='(' || ch=='{' || ch=='[')
            {
                st.push(ch);
            }
            
            else if(ch == '}')
            {
               checkBalance(st,'{');
            }
            
            else if(ch == ']')
            {
                checkBalance(st,'[');
            }
            
            else if(ch == ')')
            {
                checkBalance(st,'(');
            }
        }
        
        // if size ==0 then it is balanced 
        if(st.size()==0)
            System.out.println("true");
        else
            System.out.println("false");
            
    }
    
    static void checkBalance(Stack<Character> st ,char corresponding_ch)
    {
        if(st.size()==0)
        {
            System.out.println("false");
        }
        else if(st.peek()!= corresponding_ch)
        {
            System.out.println("false");
        }
        else
            st.pop();
        
    }
    
}
