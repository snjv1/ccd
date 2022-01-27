package prjct1;
import java.util.*;
public class string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("enter 1st string");
        String s1=sc.nextLine();
        System.out.println("enter 2nd string");
        String s2=sc.nextLine();
        String s3=s1.concat(s2);
        System.out.println(s3);
        
        int a=s1.length();
        int b=s2.length();
        System.out.println("length of s1 is :" + a);
        System.out.println("length of s2 is :" + b);
        
        s1=s1.toUpperCase();
        s2=s2.toUpperCase();
        System.out.println(s1);
        System.out.println(s2);
        }
    
}
