package stackIntermediate;

import java.util.*;

class sstack
{
     Queue<Integer> q1=new LinkedList<>();
    Queue<Integer> q2=new LinkedList<>();
    
    public void push(int val)
    {
        q1.add(val);
    }
    
    public int pop()
    {
        if(q1.isEmpty())
            return -1;
        
        while(q1.size()!= 1)
        {
            q2.add(q1.remove());
        }
         int val = q1.remove();
         
         Queue<Integer> t = q1;
         q1=q2;
         q2=t;
         
         return val;
    }
    
    
    
    
}
public class stackUsing2Queue1__1 
{
    public static void main(String args[])
    {
    sstack a = new sstack();

    a.push(7);
    a.push(3);
    a.push(4);

    System.out.println(a.pop());
    System.out.println(a.pop());

    a.push(5);

    System.out.println(a.pop());
    System.out.println(a.pop());
    System.out.println(a.pop());
    }
    
}
