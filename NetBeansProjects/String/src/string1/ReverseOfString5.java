package string1;

import java.util.Scanner;

public class ReverseOfString5 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        String str=sc.nextLine();
        char c[]=str.toCharArray();
      
        int n=c.length;
        
        for(int i=c.length-1;i>=0;i--)
        {
            System.out.print(c[i]);
        }
        
    }
}
