package string2;

import java.util.*;

public class BalancedParanthesis19 
{
    public static void main(String[] args) 
    {
        String str="[()]()";
        
        Stack<Character> s=new Stack<>();
        
        for(int i=0;i<str.length();i++)
        {
            char x= str.charAt(i);
           if(s.isEmpty())
              s.push(x);
                    
           else if(x == '[' || x == '{' ||  x == '(')   
               s.push(x);
           
           else
           {
               if( x ==')' &&  s.peek()=='(' )
                   s.pop();
               
               else if( x =='}' &&  s.peek()=='{' )
                   s.pop();
               
               else if( x ==']' &&  s.peek()=='[' )
                   s.pop();
               
               else 
                   s.push(x);
           }
        }
        
        if(s.isEmpty())
            System.out.println(" Balanced ");
        else 
            System.out.println(" Not Balanced ");
        
    }
}
        

