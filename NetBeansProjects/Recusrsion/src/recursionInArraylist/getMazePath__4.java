package recursionInArraylist;

import java.util.*;

public class getMazePath__4 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        int n =sc.nextInt();
        int m =sc.nextInt();
        
        ArrayList<String> result = getMazePaths(1,1,n,m);
        System.out.println(result);
        
        
        
    } 
    // sr = source row 
    // sc source col
    // destination row
    // destination col
     public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
     
         if(sr == dr && sc==dc)
         {
             ArrayList<String> bres = new ArrayList<>();
             bres.add("");
             return bres;
         }
         if(sr > dr || sc > dc)
         {
             ArrayList<String> bres = new ArrayList<>();
             return bres;
             
         }
          
          ArrayList<String> hpaths = getMazePaths(sr,sc+1,dr,dc);
          ArrayList<String> vpaths = getMazePaths(sr+1,sc,dr,dc);
          
          ArrayList<String> resu= new ArrayList<>();
          
         
          
          for(String path : hpaths)
          {
              resu.add("H" + path);
          }
          
          for(String path : vpaths)
          {
              resu.add("V" + path);
          }
          
          return resu;
    }
}
