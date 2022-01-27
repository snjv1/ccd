package string2;
import java.util.*;
public class RemoveDuplicateChar2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        
         HashSet<Character> hs = new HashSet<>();
         HashSet<Character> hs1 = new HashSet<>();
         for(int i=0;i<s1.length();i++)
         {
             if(hs.contains(s1.charAt(i)))
                 hs1.add(s1.charAt(i));
             else
                 hs.add(s1.charAt(i));
                 
         }
         System.out.println("after removing  duplicate elements string is ");
               for(Character ch : hs) 
            System.out.print(ch); 
               System.out.println();
               
               System.out.println("duplicate elements are");
                     for(Character ch : hs1) 
            System.out.print(ch); 
         
                     
    }
    
}
