package string1;

import java.util.*;

public class Occurence2And4 {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();
        
        count(str);
    }
    
    static void count(String str)
    {
        char[] array= str.toCharArray();
        
        HashMap<Character,Integer> hs=new HashMap<>();
        
        for(char c:array)
        {
            if(hs.containsKey(c))
                hs.put(c, hs.get(c)+1);
            else
                hs.put(c, 1);
        }
        
        System.out.println("occurence of elements");
          System.out.println("duplicates elements  respectively"); 
        for(Map.Entry<Character,Integer> a :hs.entrySet())
        {
            
            System.out.println( a.getKey()  +" "+ a.getValue());
            
          
            if(a.getValue() > 1)     // to find duplicates elements in string
                System.out.println( a.getKey()  +" dupllicate elements are "+ a.getValue());
                
        }


    }
    
}
