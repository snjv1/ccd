package string1;

import java.util.Scanner;

public class whiteSpaces3 {
    public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
        String str =sc.nextLine();
        System.out.println(str);
        System.out.println(str.replaceAll("\\."," "));
        
        
    }
}
