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
public class printStairPath__3 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        printStair(n,"");
    }
    
    public static void printStair(int n, String ans)
    {
        
        if(n==0)
        {
            System.out.println(ans);
            return;
        }
        if(n<0)
        {
            return;
        }
        
        printStair(n-1,ans+"1");
        printStair(n-2,ans+"2");
        printStair(n-3,ans+"3");
                
            
            
    }
    
}
