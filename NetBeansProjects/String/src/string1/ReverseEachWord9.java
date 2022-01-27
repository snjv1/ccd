package string1;

import java.util.*;

public class ReverseEachWord9 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      String s=sc.nextLine();
              
      reverse(s);  
        
    }
    
    static void reverse(String str){
  
        Stack<Character> st=new Stack<>();
        
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
                st.push((str.charAt(i)));
            
            else{
                while(st.empty()==false)
                {
                    System.out.println(st.pop());
                }
                System.out.println(" ");
                }
        }
        
        while(st.empty()==false)
        {System.out.println(st.pop());
        
    }
}
}