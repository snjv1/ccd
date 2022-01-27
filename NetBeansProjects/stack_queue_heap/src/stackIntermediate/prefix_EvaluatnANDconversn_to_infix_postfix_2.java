/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackIntermediate;

import java.util.*;

/**
 *
 * @author sanje
 */
public class prefix_EvaluatnANDconversn_to_infix_postfix_2  
{
    public static void main(String[] args)  
    {
        
        String exp ="-+2/*6483";
        
        Stack<Integer> evaluation = new Stack<>();
        Stack<String> postfix = new Stack<>();
        Stack<String> infix = new Stack<>();
        
        
        for(int i =exp.length()-1; i>=0; i--)
        {
            char ch = exp.charAt(i);
            
            if(ch=='+' || ch=='*' || ch=='/' || ch=='-')
            {
               
                //evaluation of prefix
                 int v1 = evaluation.pop();
                int v2 = evaluation.pop();
                int val = operation(v1, v2, ch);
                evaluation.push(val);
                
                //conversion prefix to infix
                String iv1=infix.pop();
                String iv2= infix.pop();
                String iresult= "(" + iv1 + ch + iv2 + ")";
                infix.push(iresult);
                
                //conversion of prefix to postfix
                String pv1=postfix.pop();
                String pv2= postfix.pop();
                String presult= pv1 + pv2 + ch ;
                postfix.push(presult);
            }
            
            else
            {
                evaluation.push(ch -'0');
                infix.push(ch + "");
                postfix.push(ch + "");
            }
            
        }
        
        System.out.println(  evaluation.pop());
        System.out.println(infix.pop());
        System.out.println(postfix.pop());
        
        
    }
    
   public static int operation(int v1, int v2, char op) {
    if (op == '+') {
      return v1 + v2;
    } else if (op == '-') {
      return v1 - v2;
    } else if (op == '*') {
      return v1 * v2;
    } else if (op == '/') {
      return v1 / v2;
    } else {
      return 0;
    }
  }
        
}

                
                
            
            
        
        
        
       
    
    

