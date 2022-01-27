package stackIntermediate;

import java.util.*;

class infixEvaluation__2
{
    public static void main(String[] args) {
        
        String exp =" 2 + 6 * 4 / 8 - 3";
        
                 
       
        //INFIX evaluation
        //INFIX evaluation
        //INFIX evaluation
        Stack<Integer> number = new Stack<>();
        Stack<Character> operator = new Stack<>();
        
        for(int i=0; i<exp.length(); i++)
        {
            char ch = exp.charAt(i);
            
            if(ch=='(')
                operator.push(ch);
            
            
            else if(Character.isDigit(ch))
                number.push(ch-'0'); // - 0 because ch is a character but stack recive only integer soto convert ch into a integer
          
            
            else if(ch == ')')
            {
                while(operator.peek()!= '(' && operator.size()>0)
                {
                     //val2 jo sbse upr h top element of stack
                    int val2 = number.pop();
                    // val1 jo upr se niche wali h 
                    int val1 = number.pop();
                    char op = operator.pop();

                    
                    int result = operation(val1, val2, op);
                    number.push(result);
                }
                // last m jb '(' aa jaye to while loop ke  bhar aane ke baad isse bhi remove kr denge
                operator.pop();
            }
            
            
            else if(ch=='+' || ch=='-' || ch=='*' || ch=='/')
            {
                // ch is wanting higher priority to solve first
                while(operator.size()>0 && operator.peek()!= '(' && precedence(ch) <=precedence(operator.peek()) )
                {
                    //val2 jo sbse upr h  top element of stack
                    int val2 = number.pop();
                    // val1 jo upr se niche wali h 
                    int val1 = number.pop();
                    char op = operator.pop();

                    
                    int result = operation(val1, val2, op);
                    number.push(result);
                }
                //ch is pushing itself now
                operator.push(ch);
            }
        }
            
            // last m  jbb tk operator wali stack khali na ho jaye tbb tkk 2 element pop kr ke unpe operation krte rhenge
            while(operator.size()!= 0)
                {
                     //val2 jo sbse upr h
                    int val2 = number.pop();
                    
                    // val1 jo upr se niche wali h 
                    int val1 = number.pop();
                    
                    char op = operator.pop();
                    
                    int result = operation(val1, val2, op);
                    
                    number.push(result);
                }
            
            System.out.println(number.peek());
                
        
        
    }
 
    
    public static int precedence(char op)
    {
        if(op == '+')
            return 1;
        else if(op == '-')
            return 1;
        else if(op == '*' )
            return 2;
        else
            return 2;
        
    }
    // v2 top ka element hoga or v1 uss niche wala
    public static int operation(int val1, int val2, char op)
    {
        if(op == '+')
            return val1 + val2;
        else if(op == '-')
            return val1 - val2;
        else if(op == '*')
            return val1 * val2;
        else
            return val1/ val2;
    }
    
}

    

