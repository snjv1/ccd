/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClassFile;
import java.util.*;
public class Stack1 {
    public static void main(String[] args) {
        
       Stack<Integer> stack=new Stack<>();
       
       stack.push(5);
       stack.push(4);
       stack.push(9);
       stack.push(1);
       
        System.out.println("top element is :" + stack.peek());
         
        int n =stack.pop();
        System.out.println("pop element is :" + n );
        stack.push(4);
        System.out.println("top element is :" + stack.peek());
      
        
        if(stack.empty())
            System.out.println("stack is empty");
        else
            System.out.println("not empty");
       
       
    }}

   