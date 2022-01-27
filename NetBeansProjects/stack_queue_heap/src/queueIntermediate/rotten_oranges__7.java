package queueIntermediate;

import java.util.*;

public class rotten_oranges__7 
{
    /*
    Input: grid = {{0,1,2},{0,1,2},{2,1,1}}
    Output: 1
    
    grid = {{2,2,0,1}}
    Output: -1
    
    
    DIRECTION IN GRID (2D matrix
    UP      = i-1,j
    DOWN    = i+1,j
    LEFT    = i,j-1
    RIGHT   = i,j+1
    
    */
    public static void main(String[] args) 
    {
        //https://www.youtube.com/watch?v=DU3kgZNtdwk&t=1095s
        //https://www.youtube.com/watch?v=DU3kgZNtdwk&t=1095s
        //https://www.youtube.com/watch?v=DU3kgZNtdwk&t=1095s
        //https://www.youtube.com/watch?v=DU3kgZNtdwk&t=1095s
    
        int[][] grid = { {2, 1, 0, 2, 1},
                     {1, 0, 1, 2, 1},
                     {1, 0, 0, 2, 1}};
        
        int result =orangesRotting(grid);
        System.out.println(result);
    }
    
    
   static class Pair
    {
        int row,column;
        
        Pair(int row, int column)
        {
            this.row=row;
            this.column=column;
        }
    }
    
   static int orangesRotting(int[][] grid)
    {
        Queue<Pair> q= new LinkedList<Pair>();
        int total=0 , rotten =0, time=0;
        
        
        for(int i=0;i<grid.length;i++)
        {
            for( int j=0;j < grid[0].length;j++)
            {
                if(grid[i][j]== 1|| grid[i][j] ==2)
                    total++;                        // calculate total no of oranges rotten and fresh 
                if(grid[i][j] ==2)
                    q.offer(new Pair(i,j));  // queue contaoin rotten oranges
            }
        }
        
        // means empty there are no oranges
        if(total==0)
            return 0;
        
        while(!q.isEmpty())           // jb tk queue empty na ho jaye  AND queue empty ho jaye orr sare oranges rotten na ho paye to return -1 krdo;
        {
            int size=q.size();       // queue contain only rotten oranges  in  first phase
            rotten +=size;           // queue ka size hrr time phrase ke sath change hoga AND rotten m add krte jao ki kitne oranges abb tk rotten ho chuke h
                       if(total == rotten)      // total(( sare orange fresh and rotten))  agr rotten ho jaye to time frame return krdo
                return time;
            
            time++;            //time increase after every phrase abhi first frase h to second phrase jb ayega jbb for loop khtm jo jaeyga uske baad dubara queue ka size niklega kuki sbb nyee eleement dalle honge
            
            for( int i=0 ; i<size ; i++)
            {
                Pair p= q.peek();    //  first phase of queue
                
                if(p.row +1 <grid.length  &&  grid[p.row+1][p.column] == 1)   //downward direction m grid m ho usse bhar nhi jana   agrs fresh orange h to (==1)
                {
                     grid[p.row+1][p.column]=2;                               // then mark it rotten 
                     q.offer(new Pair(p.row+1,p.column));                      // usse rotten mark krne ke baad ab uske aas pass ke bhi check ho ske second time frame m isliye isse bhi queue m dall do
                }
                
                if (p.row - 1 >= 0 && grid[p.row - 1][p.column] == 1)         //upward direction m grid m ho usse bhar nhi jana   agrs fresh orange h to (==1)
                {
                    grid[p.row - 1][p.column] = 2;                            // then mark it rotten 
                    q.offer(new Pair(p.row - 1, p.column));
                }
                if (p.column + 1 < grid[0].length && grid[p.row][p.column+ 1] == 1) //right direction
                {
                    grid[p.row][p.column + 1] = 2;
                    q.offer(new Pair(p.row, p.column + 1));                   // usse rotten mark krne ke baad ab uske aas pass ke bhi check ho ske second time frame m isliye isse bhi queue m dall do
                }
                if (p.column - 1 >= 0 && grid[p.row][p.column - 1] == 1)      //left direction
                {
                    grid[p.row][p.column - 1] = 2;
                    q.offer(new Pair(p.row, p.column - 1));                   // usse rotten mark krne ke baad ab uske aas pass ke bhi check ho ske second time frame m isliye isse bhi queue m dall do
                }
                
                q.poll();           // sath sath orange pair bhi remove krdo jis ke liye check kiya h
                
            }
            
        }
        
        return -1;
        
    }
}
