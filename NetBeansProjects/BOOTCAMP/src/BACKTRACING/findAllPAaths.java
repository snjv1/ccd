/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKTRACING;

import java.util.Arrays;

/**
 *
 * @author sanje
 */
public class findAllPAaths {	public static void main(String[] args) {
	    boolean[][] maze = {
	        {true,true,true},
	        {true,true,true},
	        {true,true,true}
	    };
            int[][] arr = new int[maze.length][maze[0].length];
		mazepaths(0,0,"",maze,arr,1);
	}
	

	static void  mazepaths(int r, int c, String ans,boolean[][] maze, int[][] arr, int step)
	{
	    if(r==maze.length-1 && c==maze[0].length-1)
	    {
                arr[r][c]=step;
                for(int[] i : arr)
                {
                    System.out.println(Arrays.toString(i));
                }
	               System.out.println(ans);
                       System.out.println();
                       return;
	    }
	    if(r>maze.length-1 || c>maze[0].length-1 || r<0 ||c<0 || maze[r][c] == false){
	        return ;
	    }
	      
	    //list.addAll(mazeArr(r+1,c+1,ans+"d",maze));
            maze[r][c]=false;
            arr[r][c]=step;
	    mazepaths(r+1,c,ans+"d",maze,arr,step+1);
	    mazepaths(r,c+1,ans+"r",maze,arr,step+1);
	    mazepaths(r-1,c,ans+"u",maze,arr,step+1);
	    mazepaths(r,c-1,ans+"l",maze,arr,step+1);
            arr[r][c]=step;
            maze[r][c]=true;
	    
	    
	    
	    
	}
}
