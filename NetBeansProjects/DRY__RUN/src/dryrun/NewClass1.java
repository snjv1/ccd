/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dryrun;

/**
 *
 * @author sanje
 */
public class NewClass1 {
    public static void main(String[] args) {
        String[] str= { "1234" , "5678" , "9875"};
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<str.length; i++)
        {
            String string = str[i];
            for(int j=0; j<string.length(); j++)
            {
                char ch = string.charAt(j);
                sb.append("'"+ch+"' ");
             
            }
            System.out.println("num"+i+" = ["+sb.toString()+"]");
            sb = new StringBuilder();
            System.out.println();
        }
    }
    
}
