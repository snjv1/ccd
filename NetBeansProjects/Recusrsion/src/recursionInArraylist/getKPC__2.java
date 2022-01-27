package recursionInArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class getKPC__2 
{
    public static void main(String[] args) {
        /*
        678
        */
        Scanner sc= new Scanner(System.in);
        String str= sc.next();
        ArrayList<String> words = getKPC(str);
        System.out.println(words);
    }
    
    static String[] codes= {"." ,"abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz" };
    public static ArrayList<String> getKPC(String str)
    {
        
        if(str.length()==0)
        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
        }
        
        char ch= str.charAt(0); //6 Expect
        String ros = str.substring(1); // 78
        
        ArrayList<String> rres = getKPC(ros);  // ye result dega 78 ka str ka
        ArrayList<String>  mres = new ArrayList<>();
        
        String codeForch = codes[ch-'0'];   // ch (6) alement ke str leli
        for(int i=0;  i<codeForch.length(); i++)
        {
            char chCode = codeForch.charAt(i);  //pqrs 
            for(String rstr : rres)
            {
                mres.add(chCode+rstr);
                
            }
        }
        return mres;
    }
}
