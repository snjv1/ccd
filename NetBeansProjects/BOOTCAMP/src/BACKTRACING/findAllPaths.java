/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BACKTRACING;

import java.util.*;

/**
 *
 * @author sanje
 */
public class findAllPaths {
	public static void main(String[] args) {
	    boolean[][] maze = {
	        {true,true,true},
	        {true,true,true},
	        {true,true,true}
	    };
            int[][] arr= new int[maze.length][maze[0].length];
		//System.out.println(mazeArr(0,0,"",maze,arr,0));
                mazeArrpaths(0,0,"",maze,arr,1);
	}
	
        
        static void mazeArrpaths(int r, int c, String ans,boolean[][] maze,int[][] arr,int count)
	{
	    if(r==maze.length-1 && c==maze[0].length-1)
	    {
	       arr[r][c]=count;
               
               for(int[] i: arr)
               {
                   System.out.println(Arrays.toString(i));
               }
                System.out.println(ans);
                return;
	    }
            
	    if(r>maze.length-1 || c>maze[0].length-1 || r<0 ||c<0 || maze[r][c] == false){
	        return ;
	    }
	 
	    
	    maze[r][c]=false;
            arr[r][c]=count;
	    //list.addAll(mazeArr(r+1,c+1,ans+"d",maze));
	    mazeArrpaths(r+1,c,ans+"d",maze,arr,count+1);
	    mazeArrpaths(r,c+1,ans+"r",maze,arr,count+1);
	    mazeArrpaths(r-1,c,ans+"u",maze,arr,count+1);
	    mazeArrpaths(r,c-1,ans+"l",maze,arr,count+1);
            maze[r][c]=true;
            arr[r][c]=count;
	    
	    
	    
	}

	static ArrayList<String> mazeArr(int r, int c, String ans,boolean[][] maze,int[][] arr,int count)
	{
	    if(r==maze.length-1 && c==maze[0].length-1)
	    {
	        ArrayList<String> list= new ArrayList<>();
	        list.add(ans+"  "+ count);
	        return list;
	    }
	    if(r>maze.length-1 || c>maze[0].length-1 || r<0 ||c<0 || maze[r][c] == false){
	        return new ArrayList<>();
	    }
	    ArrayList<String> list = new ArrayList<>();
	    
	    maze[r][c]=false;
            arr[r][c]=1;
	    //list.addAll(mazeArr(r+1,c+1,ans+"d",maze));
	    list.addAll(mazeArr(r+1,c,ans+"d",maze,arr,count+1));
	    list.addAll(mazeArr(r,c+1,ans+"r",maze,arr,count+1));
	    list.addAll(mazeArr(r-1,c,ans+"u",maze,arr,count+1));
	    list.addAll(mazeArr(r,c-1,ans+"l",maze,arr,count+1));
            maze[r][c]=true;
            arr[r][c]=0;
	    
	    
	    
	    return list;
	}
}
