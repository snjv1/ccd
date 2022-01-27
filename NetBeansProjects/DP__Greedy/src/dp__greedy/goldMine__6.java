package dp__greedy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class goldMine__6 
{
    public static void main(String[] args) throws Exception {
        
//                int[][] arr= { 
//                    {0, 1, 4, 2, 8, 2},
//                    {4, 3, 6, 5, 0, 4},
//                    {1 ,2 ,4 ,1 ,4, 6},
//                    {2 ,0 ,7 ,3 ,2 ,2},
//                    {3, 1, 5, 9, 2, 4},
//                    {2, 7, 0, 8, 5, 1} };
        
          //  recursive(arr);
            
            //memorization(arr);
            
            
            
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(br.readLine());
      int m = Integer.parseInt(br.readLine());
            
            int[][] arr= new int[n][m];
            for (int i = 0; i < n; i++)     
            {
                String str = br.readLine();
                for (int j = 0; j < m; j++) 
                {
                    arr[i][j] = Integer.parseInt(str.split(" ")[j]);
                 }
            }
            
            tabulation(arr,n,m);
            
            
            
        
    }
    
    public static void tabulation(int[][] arr,int n, int m)
    {
        
        int[][] dp= new int[n][m];
            for(int j=arr[0].length-1; j>=0; j--)   // last column
            {
                for(int i=arr.length-1; i>=0; i--)     // last row 
                {
                    if(j==arr[0].length-1) // last column h to dp m lsat colmn copy krdo
                    {
                        dp[i][j]= arr[i][j];
                    }
                    
                    else if(i==0)       // top row (A)-> Straight (B)-> Right down Diagonal
                    {
                        dp[i][j]= arr[i][j] + Math.max( dp[i][j+1] , dp[i+1][j+1]   );
                    }
                    
                    else if(i==arr.length-1)   // last row (A)-> Straight (B)-> Right up Diagonal
                    {
                        dp[i][j]= arr[i][j] + Math.max( dp[i][j+1] , dp[i-1][j+1]   );
                    }
                    
                    else
                    {
                        dp[i][j]= arr[i][j] + Math.max( dp[i][j+1] , Math.max(dp[i-1][j+1], dp[i+1][j+1]));
                    }
                }
            }
            
            int max=dp[0][0];
            for(int i=0; i<dp.length; i++)
            {
                max= Math.max(max,dp[i][0]);
            }
            
            System.out.println(max);
            
            
    }
            
    
    
    
    
    
    
    
    
    
    
    
    
    public static void recursive(int[][] arr)
    {
        int maxGold= Integer.MIN_VALUE;
        for(int i=0; i<arr.length ;i++)
        {
            int gdcollect = goldcollected(arr,i,0,arr.length-1,arr[0].length-1);
             maxGold = Math.max(maxGold, gdcollect);
        }
        
        System.out.println(maxGold);
    }
    
    
    public static int goldcollected(int[][] arr, int r, int c, int n, int m)
    {
     
        if(r<0 || r>n || c>m)
        {
            return 0;
        }
        
        int upperRight=goldcollected(arr,r-1,c+1,n,m);
        int straight=goldcollected(arr,r,c+1,n,m);
        int lowerRight=goldcollected(arr,r+1,c+1,n,m);
        
        return arr[r][c] + Math.max(Math.max(upperRight, straight), lowerRight);  
                
    }
    
    
    
    
    
    
    public static void memorization(int[][] arr)
    {
        int maxGold= Integer.MIN_VALUE;
        
        // Initialize the dp matrix
        int[][] dp = new int[arr.length + 1][arr[0].length + 1];
        for (int i = 0; i <= arr.length; i++) {
            for (int j = 0; j <= arr[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        for(int i=0; i<arr.length ;i++)
        {
            int gdcollect = memoGdCollect(arr,i,0,arr.length-1,arr[0].length-1,dp);
             maxGold = Math.max(maxGold, gdcollect);
        }
        
        System.out.println(maxGold);
    }
    
     public static int memoGdCollect(int[][] arr, int r, int c, int n, int m, int[][] qb)
    {
     
        if(r<0 || r>n || c>m)
        {
            return 0;
        }
        
        if(qb[r][c] != -1)
            return qb[r][c];
        
        int upperRight=goldcollected(arr,r-1,c+1,n,m);
        int straight=goldcollected(arr,r,c+1,n,m);
        int lowerRight=goldcollected(arr,r+1,c+1,n,m);
        
         int ans= arr[r][c] + Math.max(Math.max(upperRight, straight), lowerRight);  
         
         qb[r][c] = ans;
         
         return ans;
    }
     
     
     
     
}
