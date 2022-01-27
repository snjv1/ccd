/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 *
 * @author sanje
 */
public class Small_Larg_Ciel_Floor_of_graph__4 {
    
     static class Edge{
        int src,nbr,wt;
        
        Edge(int src, int nbr, int wt)
        {
            this.src=src;
            this.nbr=nbr;
            this.wt=wt;
        }
    }
     
     static class Pair implements Comparable<Pair> 
     {
         int weight;
         String path;
         
         Pair(int weight,String path)
         {
             this.weight=weight;
             this.path=path;
         }
         
         public int compareTo(Pair o)
         {
             return this.weight-o.weight;
         }
     }
    public static void main(String[] args) 
    {
         int vtces= 7;
          ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) 
      {
         graph[i] = new ArrayList<Edge>();
      }
      
      graph[0].add(new Edge(0,1,10));
      graph[0].add(new Edge(0,3,40));
      
      graph[1].add(new Edge(1,0,10));
      graph[1].add(new Edge(1,2,10));
            
      graph[2].add(new Edge(2,1,10));
      graph[2].add(new Edge(2,3,10));
      graph[2].add(new Edge(2,5,5));
      
      graph[3].add(new Edge(3,0,40));
      graph[3].add(new Edge(3,2,10));
      graph[3].add(new Edge(3,4,2));
      
      graph[4].add(new Edge(4,3,2));
      graph[4].add(new Edge(4,5,3));
      graph[4].add(new Edge(4,6,8));
      
      graph[5].add(new Edge(5,2,5));
      graph[5].add(new Edge(5,4,3));
      graph[5].add(new Edge(5,6,3));
      
      graph[6].add(new Edge(6,4,8));
      graph[6].add(new Edge(6,5,3));
      
      
      /*
      Smallest Path = 01256@28
      Largest Path = 032546@66
      Just Larger Path than 30 = 012546@36
      Just Smaller Path than 30 = 01256@28
      4th largest path = 03456@48
      */
      
      int src=0;
      int dest=6;
      int criteria=30;  // Ciel and Floor
      int k =4;         //4 largest path
      
    
      boolean[] visited = new boolean[vtces];
      multisolver(graph, src, dest, visited, criteria, k, src + "", 0);
      
      System.out.println("Smallest Path = " + smallPath + "@ weight " + smallPathWeight);
      System.out.println("Largest Path = " + largePath + "@ weight " + largerPathWeight);
      System.out.println("Just Larger Path than " + criteria + " = " + ceilPath + "@ weight " + ceilPathWeight);
      System.out.println("Just Smaller Path than " + criteria + " = " + floorPath + "@ weight " + floorrPathWeight);
      System.out.println(k + "th largest path = " + pq.peek().path + "@" + pq.peek().weight);
      
}
    
    static String smallPath;
    static Integer smallPathWeight = Integer.MAX_VALUE;
    static String largePath;
    static Integer largerPathWeight = Integer.MIN_VALUE;
    static String ceilPath;
    static Integer ceilPathWeight = Integer.MAX_VALUE;
    static String floorPath;
    static Integer floorrPathWeight = Integer.MIN_VALUE;
    static PriorityQueue<Pair> pq= new PriorityQueue<>();
    public static void multisolver(ArrayList<Edge>[] graph, int src, int dest, boolean[] visited, int criteria,int k, String path, int weight)
    {
        if(src==dest)
        {
            if(weight<smallPathWeight)
            {
                smallPathWeight=weight;
                smallPath=path;
            }
            
            if(weight>largerPathWeight)
            {
                largerPathWeight=weight;
                largePath=path;
            }
            
            if(weight>criteria && weight<ceilPathWeight)
            {
                ceilPathWeight=weight;
                ceilPath=path;
            }
            
             if(weight<criteria && weight>floorrPathWeight)
            {
                floorrPathWeight=weight;
                floorPath=path;
            }
             
            if(pq.size()<k)
            {
                pq.add(new Pair(weight,path));
            }else
            {
                if(weight>pq.peek().weight)
                {
                    pq.remove();
                    pq.add(new Pair(weight,path));
                }
            }
             
            
            
            return;
        }
        
        visited[src]=true;
        for( Edge e: graph[src])
        {
            if(visited[e.nbr]==false)
            {
                multisolver(graph, e.nbr,dest,visited,criteria,k,path+e.nbr,weight+e.wt);
            }
        }
        visited[src]=false;
        
    }
}
