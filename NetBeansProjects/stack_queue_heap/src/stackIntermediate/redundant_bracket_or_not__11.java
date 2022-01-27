/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackIntermediate;

import java.util.Scanner;
import java.util.Stack;

public class redundant_bracket_or_not__11 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        Stack<Character> st = new Stack<>();

String str=" ((a + b) + (c + d)) ";  //false
String str2="(a + b) + ((c + d))  ";                // true
        
        for(int i=0; i<str2.length(); i++)
        {
            char ch= str2.charAt(i);
            if(ch==')')
            {
                if(st.peek()=='(')
                {
                    System.out.println("true");
                    return;
                }
                else
                {
                    // do bracket ke bich ka maal pop krdo jbb tk openinig na aajaye
                    while(st.peek()!='(')
                    {
                        st.pop();
                    }
                    // while ke bhar aate hi opening bhi pop krdo 
                    st.pop();
                }
            }
            
            // koi bhi character ho to puh krdo except ')'
            else 
            {
                st.push(ch);
            }
        }
        
        System.out.println("false not duplicate bracket found");
        
        
    }
    
}
