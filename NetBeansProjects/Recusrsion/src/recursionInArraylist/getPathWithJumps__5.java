package recursionInArraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class getPathWithJumps__5 
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        
        int n= sc.nextInt();
        int m= sc.nextInt();
        
        ArrayList<String> result = getMazePaths(1,1,n,m);
        System.out.println(result);
        
        
        
    }
    
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) 
    {
        if(sr==dr && sc==dc)
        {
            ArrayList<String> brew = new ArrayList<>();
            brew.add("");
            return brew;
            
        }
        
        
        
        ArrayList<String> resu = new ArrayList<>();
        
        
        for(int ms=1; ms<=dc-sc; ms++)       // horizontal jump lgane k liye jump 1ki 2 ki 3 ki
        {
            ArrayList<String>  hpaths = getMazePaths(sr,sc+ms,dr,dc);
            {
                for(String path : hpaths)
                {
                    resu.add("h" + ms + path);  // hr jump ke sath sath jump ka no bhi add krte jaeynge as a result                
                }
            }
        }
         
        for(int ms=1; ms<=dr-sr; ms++)       // vertical jump lgane k liye jump 1ki 2 ki 3 ki
        {
            ArrayList<String>  vpaths = getMazePaths(sr+ms,sc,dr,dc);
            {
                for(String path : vpaths)
                {
                    resu.add("v" + ms + path);  // hr jump ke sath sath jump ka no bhi add krte jaeynge as a result                
                }
            }
        }
        
        for(int ms=1; ms<=dr-sr && ms<=dc-sc; ms++)       // diagonal jump lgane k liye jump 1ki 2 ki 3 ki
        {
            ArrayList<String>  dpaths = getMazePaths(sr+ms,sc+ms,dr,dc);
            {
                for(String path : dpaths)
                {
                    resu.add("d" + ms + path);  // hr jump ke sath sath jump ka no bhi add krte jaeynge as a result                
                }
            }
        }
          return resu;
    }
}
