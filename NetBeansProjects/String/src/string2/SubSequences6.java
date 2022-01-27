package string2;

import java.util.*;

public class SubSequences6 
{
    public static void main(String[] args) 
    {   
        String s="aabc";
        subSequence(s);
         System.out.println(st);
        
    }
    static HashSet<String> st=new HashSet<>();
    
    static void subSequence(String str)
    {
        
        for(int i=0;i<str.length();i++)
        {
            for(int j=str.length();j>i;j--)
            {
                String sub_str = str.substring(i,j);
                if(!st.contains(sub_str))
                    st.add(sub_str);
                
                for(int k=1;k<sub_str.length();k++)
                {
                    StringBuffer sb=new StringBuffer(sub_str);
                    sb.deleteCharAt(k);
                    if(!st.contains(sb));
                    subSequence(sb.toString());
                    
                    
                }
                    
            }
            
        }
        
        
    }
   
}
