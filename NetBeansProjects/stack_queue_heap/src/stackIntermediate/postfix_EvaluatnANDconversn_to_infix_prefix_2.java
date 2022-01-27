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
public class postfix_EvaluatnANDconversn_to_infix_prefix_2 {
    public static void main(String[] args) {
        
        
        String str="264*8/+3-";
        
        Stack<Integer> evaluation = new Stack<>();
        Stack<String> prefix = new Stack<>();
        Stack<String> infix = new Stack<>();
        
        for(int i=0; i<str.length(); i++)
        {
            char ch = str.charAt(i);
            
            if(ch=='+' || ch=='*' || ch=='/' || ch=='-')
            {
                //evaluation of postfix
                 int v2 = evaluation.pop();
                int v1 = evaluation.pop();
                int val = operation(v1, v2, ch);
                evaluation.push(val);
                
                //conversion postfix to infix
                String iv2=infix.pop();
                String iv1= infix.pop();
                String iresult= "(" + iv1 + ch + iv2 + ")";
                infix.push(iresult);
                
                //conversion of postfix to prefix
                String pv2=prefix.pop();
                String pv1= prefix.pop();
                String presult=   ch + pv1 + pv2 ;
                prefix.push(presult);
            }
            
            else
            {
                evaluation.push(ch -'0');
                infix.push(ch + "");
                prefix.push(ch + "");
            }
            
        }
        
        System.out.println(  evaluation.pop());
        System.out.println(prefix.pop());
        System.out.println(infix.pop());
        
        
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
