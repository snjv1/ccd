package string1;
import java.util.*;
public class StringPalindroneOrNot10 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        
        int i=0,j=str.length()-1;
        
        int P=1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                P=0;
                break;
            }               
            else
            {
                i++;
                j--;
            }
        }
        if(P==1)
            System.out.println("string is palindrone");
        else
            System.out.println("not palindrone");
        
    }   
}
