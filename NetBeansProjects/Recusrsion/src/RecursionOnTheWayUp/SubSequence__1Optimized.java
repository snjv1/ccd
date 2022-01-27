package RecursionOnTheWayUp;

import java.util.Scanner;

public class SubSequence__1Optimized 
{
    public static void main(String[] args) {
        
        Scanner sc= new Scanner(System.in);
        
        String str=sc.nextLine();
        printSub(str,"");
        
        
    }
    public static void printSub(String ques, String ans)
    {
        if(ques.length()==0)
        {
            System.out.println(ans);
            return;
        }
        
        char ch= ques.charAt(0);
        String roq=ques.substring(1);
        
        printSub(roq, ans + ch);
        printSub(roq, ans+"");
    }
    
}
