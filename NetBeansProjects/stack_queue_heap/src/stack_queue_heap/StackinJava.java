package stack_queue_heap;

import java.util.*;


class stack
{
    int max= 1000;
    int top=-1;
    int array[]=new int[max];
    
    boolean push(int x)
    {
        if(top >= max-1)
        {
            System.out.println("overflow");
            return false;
        }
        else
        {
            top++;
            array[top]=x;
            System.out.println("pushed into stack");
            return true;
        }
    }
    
    int pop()
    {
        if(top<0)
        {
            System.out.println("stack underflow");
            return 0;
        }
        else
        {
            int x= array[top];
            top--;
            return x;
        }
    }
    
    int peek()
    {
        if(top<0)
        {
            System.out.println("underflow");
            return 0;
        }
        else
        {
            int x=array[top];
            return x;
        }
    }
    
    boolean isEmpty()
    {
        return (top<0);
    }
            
    
    
    public boolean balancedBracket(String str)
    {
        Deque<Character> stack = new ArrayDeque<>();
        
        for(int i=0; i<str.length() ; i++)
        {
            char x= str.charAt(i);
            
            if( x== '{' || x== '[' || x=='(')
            {
                stack.push(x);
                continue;
            }
            
            if(stack.isEmpty())
                return false;
            
            char check;
            switch(x)
            {
                case ')' :
                    check=stack.pop();
                    if(check == '{' || check =='[')
                        return false;
                    break;
                    
                case '}' :
                    check=stack.pop();
                    if(check == '(' || check =='[')
                        return false;
                    break;
                 
                case ']' :
                    check=stack.pop();
                    if(check == '{' || check =='(')
                        return false;
                    break;    
                    
            }
            
        }
        
        return (stack.isEmpty());
        
    }
    
    
    
    
    
    
    
    
}






public class StackinJava 
{
    public static void main(String[] args) 
    {
//        
        stack s = new stack();
//        s.push(10);
//        s.push(20);
//        s.push(30);
        //System.out.println(s.pop() + " Popped from stack");
        
        
        String expr = "([{}])"; 
  
        // Function call 
        if (s.balancedBracket(expr)) 
            System.out.println("Balanced "); 
        else
            System.out.println("Not Balanced "); 
        
        
        
        
      

        
        
        
        
        
    }
}


