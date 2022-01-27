package RecursionOnTheWayUp;

import java.util.Scanner;

public class permutation__6 {
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        String str= sc.nextLine();
        printPermutations(str,"");
    }
    
     public static void printPermutations(String qtn, String ans) {
     
         if(qtn.length()==0){
             System.out.println(ans);
             return;
         }
         
         for(int i=0; i<qtn.length(); i++)
         {
             char ch = qtn.charAt(i);
             String qlpart =qtn.substring(0,i);
             String qrpart = qtn.substring(i+1);
             String ros= qlpart + qrpart;
             
             printPermutations(ros,ans + ch);
         }
    }
    
}
