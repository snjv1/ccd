package string2;
import java.util.*;
public class EditDistance15 
        
        /*
        
        https://youtu.be/AuYujVj646Q
        */
        
        
        
        
        
        
        
        
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine().replaceAll("\\s","");
        String str2=sc.nextLine().replaceAll("\\s","");
        System.out.println(editDistance(str1,str2));
    }
    
    static int editDistance(String str1,String str2)
    {
        int m=str1.length();
        int n=str2.length();
        
        int dp[][]=new int[m+1][n+1];
        
        for(int i=0;i<=m;i++)
        {
            for(int j=0;j<=n;j++)
            {
                if(i==0)
                    dp[i][j] = j;
                
                else if(j==0)
                    dp[i][j] = i;
                else if(str1.charAt(i-1)==str2.charAt(j-1))
                    dp[i][j] = dp[i-1][j-1];
                else
                    dp[i][j]= 1+  min( dp[i][j-1], dp[i-1][j], dp[i-1][j-1]);
            }
        }
        return dp[m][n];
    }
    
    static int min(int x,int y,int z)
    {
        if(x<=y && x<=z)
            return x;
        else if(y<=x && y<=z)
            return y;
        else
            return z;
    }
    
}
