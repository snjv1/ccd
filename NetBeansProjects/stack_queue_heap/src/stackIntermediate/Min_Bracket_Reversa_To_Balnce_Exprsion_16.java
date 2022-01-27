/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackIntermediate;

import java.util.Stack;

/**
 * 
}{{}}{{{
{{}}}}
{{}{{{}{{}}{{
{{{{}}}}

Output
3
1
-1
0
 */
public class Min_Bracket_Reversa_To_Balnce_Exprsion_16 {
    public static void main(String[] args) {
        int count =0;
        String str="}{{}}{{{";
        Stack<Character> st= new Stack<>();
        
        if(str.length()%2==0)
        {
        
        for( int i=0; i < str.length(); i++)
        {
            char ch= str.charAt(i);
            if(ch == '}')
            {
                if(st.size()==0)
                {
                    st.push('{');
                    count++;
                }
                else
                    st.pop();
            }
            else
            {
                st.push(ch);
            }
            
            
        }
        
        if(st.size()>0)
        {
            int x= st.size();
            count += x/2;
        }
        
        System.out.println(count);
    }
        
        else
        {
            System.out.println(-1);
        }
        
        
    
}
}
