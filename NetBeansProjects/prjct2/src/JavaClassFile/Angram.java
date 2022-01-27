package JavaClassFile;
import java.util.*;
// 1 remove spaces 
// 2 compare both length if false not anagram
// 3 convert string into array
// 4 sort 
// 5 compare both array
public class Angram {
    public static void main(String[] args) 
    {
        Anagram a=new Anagram();
       a.isAnagram("PEEK" , "keep");
       a.isAnagram("moTHER IN law" , "Law in mother");
       
        
    }
    
}

class Anagram
{
    public int isAnagram(String str1,String str2)
    {
      
        String s1=str1.replaceAll("\\s","");
         String s2=str2.replaceAll("\\s","");
        
        boolean status=true;
        if(s1.length() != s2.length())
            status=false;
  
        else
        {
            char[] Arry1=s1.toLowerCase().toCharArray();
            char[] Arry2=s2.toLowerCase().toCharArray();
            
            Arrays.sort(Arry1);
            Arrays.sort(Arry2);
            
            status=Arrays.equals(Arry1, Arry2);           
        }
        
        if(status)
        {
            System.out.println( s1 + " and " + s2 +" are Anagrams" );
        }else
        {
            System.out.println(s1 + " and " + s2 +" are not Anagrams");
        }
        return 0;
        
    }
    
}
