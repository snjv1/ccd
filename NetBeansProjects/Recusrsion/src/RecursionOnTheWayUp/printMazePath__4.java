/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionOnTheWayUp;

import java.util.Scanner;

/**
 *
 * @author sanje
 */
public class printMazePath__4 {
    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        printMazePaths(1,1,n,m,"");

 }

	    // sr - source row
	    // sc - source column
	    // dr - destination row
	    // dc - destination column
	    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
	     
	     
         if(sr > dr || sc > dc)
         {
            return;
             
         }
	     if(sr == dr && sc==dc)
         {
             System.out.println(psf);
             return;
         }
	     
	     printMazePaths(sr,sc+1,dr,dc,psf+"h");
          printMazePaths(sr+1,sc,dr,dc,psf+"v");   
	    }

	}