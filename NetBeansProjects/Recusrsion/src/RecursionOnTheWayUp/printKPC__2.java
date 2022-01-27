/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RecursionOnTheWayUp;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author sanje
 */
public class printKPC__2 {
    public static void main(String[] args) {
        
           Scanner sc= new Scanner(System.in);
        String str= sc.next();
        printKPC(str,"");
    }
    
    static String[] codes= {"." ,"abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz" };
    public static void printKPC(String qtn , String ans)
    {
        if(qtn.length()==0)
        {
            System.out.println(ans);
            return;
        }
        
        char ch = qtn.charAt(0);
        String ros= qtn.substring(1);
        
        String codeforch = codes[ch-'0']; // ch-0 because we want element on 6 postn but ch is char to convert char to no 
        for(int i=0 ; i<codeforch.length(); i++)
        {
            char cho =codeforch.charAt(i);
            printKPC(ros,ans+cho);
        }
    }
}
