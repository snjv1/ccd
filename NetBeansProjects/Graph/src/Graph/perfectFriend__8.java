package Graph;

import java.io.*;
import java.util.*;

public class perfectFriend__8 
{
       static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }
       /*
       
       input is this 
         7
         5
         0 1
         2 3
         4 5
         5 6
         4 6
       */

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int n = Integer.parseInt(br.readLine());//totoal no of students
      int k = Integer.parseInt(br.readLine()); // total no of club of students

      int vtces = n;
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = k;
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }
      
      int pairs=0;
      boolean[] visited =new boolean[vtces];
      ArrayList<ArrayList<Integer>> components = new ArrayList<>();
      for(int i=0; i<vtces; i++ )
      {
          if(visited[i]==false)
          {
              ArrayList<Integer> comp= new ArrayList<>();
              friendIsPerfect(graph,i,visited,comp);
              components.add(comp);
          }
      }
      
      
      for(int i=0; i <components.size(); i++)
      {
          for(int j=i+1 ; j<components.size() ; j++)
          {
              pairs += components.get(i).size() * components.get(j).size();
          }
      }
      
       System.out.println("Total no of pairs are "+pairs);
          
      }
   
   public static void friendIsPerfect(ArrayList<Edge>[] graph , int src , boolean[] visited, ArrayList<Integer> comp)
   {
       visited[src]=true;
       comp.add(src);
       for(Edge e : graph[src])
       {
           if(visited[e.nbr]==false)
           {
               friendIsPerfect(graph,e.nbr,visited,comp);
           }
       }
   }
    
}
