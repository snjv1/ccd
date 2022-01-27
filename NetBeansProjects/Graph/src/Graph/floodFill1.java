package Graph;


import java.util.*;

public class floodFill1 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        
        int n=3;
        int m=3;
        
        int[][] arr={{0,0,0} ,{1,0,1} ,{0,0,0}};
        int[][] arr1={{0,0,0} ,{0,0,1} ,{0,0,0}};
        
        
        boolean[][]  visited = new boolean[n][m];
        floodfill(arr1,0,0,"",visited);
        
    }
    
    
    // alwau=ys make call in a patter TOP,LEFT,DOWN,RIGHT
    public static void floodfill(int[][] maze,int row, int col, String psf , boolean[][] visited)
    {
       if(row < 0 || col < 0 || row >= maze.length || col >= maze[0].length || 
         maze[row][col] == 1 || visited[row][col] == true)
       {
           return;
       }
        
        else if(row == maze.length-1 && col == maze[0].length-1)
        {
            System.out.println(psf);
            return;
        }
        
        visited[row][col]=true;
        floodfill(maze,row-1,col,psf +"t",visited);
        floodfill(maze,row,col-1,psf +"l",visited);
        floodfill(maze,row+1,col,psf +"d",visited);
        floodfill(maze,row,col+1,psf +"r",visited);
        visited[row][col]=false;
        
    }
    
}
