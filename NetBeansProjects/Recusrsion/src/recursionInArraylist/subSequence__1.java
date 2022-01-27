package recursionInArraylist;

import java.util.ArrayList;

public class subSequence__1 {
    public static void main(String[] args) {
        
        String str="abc";
        ArrayList<String> res= gss(str);
        System.out.println(res);
        
    }
    
    
    //abc = [ --- ,--c,-b-,-bc,a--,a-c,ab-,abc]  EX
    //bc = [--, b- ,-c, bc ]                     FAITH
    public static ArrayList<String> gss(String str) 
    {
        if(str.length()==0)
        {
            ArrayList<String> bres = new ArrayList<>();
            bres.add("");
            return bres;
            
        }
        
        char ch =str.charAt(0); //a
        String ros = str.substring(1); //bc
        
        ArrayList<String> rres= gss(ros);
        
        ArrayList<String> mres = new ArrayList<>();
        for(String rstr : rres)
        {
            mres.add(""+rstr);
            mres.add(ch + rstr);
        }
        
        return mres;
        
    }
    
}
