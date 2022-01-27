package Graph;
public class noOfIsland__7 
{
    public static void main(String[] args) {
        
        int [][] arr= 
        {
        {0 ,0 ,1 ,1 ,1 ,1 ,1 ,1},
        {0 ,0 ,1 ,1 ,1 ,1 ,1 ,1},
        {1 ,1 ,1 ,1 ,1 ,1 ,1 ,0},
        {1 ,1 ,0 ,0 ,0 ,1 ,1 ,0},
        {1 ,1 ,1 ,1 ,0 ,1 ,1 ,0},
        {1 ,1 ,1 ,1 ,0 ,1 ,1 ,0},
        {1 ,1 ,1 ,1 ,1 ,1 ,1 ,0},
        {1 ,1 ,1 ,1 ,1 ,1 ,1 ,0}};
        
        int n=arr.length;
        int m=arr[0].length;
        
        int count=0;
        boolean[][] visited= new boolean[n][m];
        
        for(int i=0; i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(arr[i][j]==0 && visited[i][j]==false)
                {
                    countIsland(arr,i,j,visited);
                    count++;
                }
            }
        }
       
        System.out.println("Total island are " + count);
    }
    
    public static void countIsland(int[][] arr, int i, int j, boolean[][] visited)
    {
        if(i<0 || j<0 || i>=arr.length || j>=arr[0].length || arr[i][j]==1 || visited[i][j]==true)
            return;
        
        
        visited[i][j]=true;
        
        countIsland(arr,i-1,j,visited);
        countIsland(arr,i,j-1,visited);
        countIsland(arr,i+1,j,visited);
        countIsland(arr,i,j+1,visited);
        
    }
    
}
