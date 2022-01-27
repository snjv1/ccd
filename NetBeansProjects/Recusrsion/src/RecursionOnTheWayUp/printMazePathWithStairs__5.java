package RecursionOnTheWayUp;

import java.util.Scanner;

public class printMazePathWithStairs__5 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        int dr= sc.nextInt();
        int dc=sc.nextInt();
        
        printMazePaths(1,1,dr,dc,"");
        
    }
    
     public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        
         if(sr==dr && sc==dc)
         {
             System.out.println(psf);
             return;
         }
         
         for(int ms=1; ms<=dc-sc; ms++)
         {
             printMazePaths(sr,sc+ms,dr,dc,psf+"h"+ms);
         }
         
         for(int ms=1; ms<=dr-sr; ms++)
         {
             printMazePaths(sr+ms,sc,dr,dc,psf+"v"+ms);
         }
         
         for(int ms=1; ms<=dc-sc && ms<=dr-sr; ms++)
         {
             printMazePaths(sr+ms,sc+ms,dr,dc,psf+"d"+ms);
         }
    }
}
