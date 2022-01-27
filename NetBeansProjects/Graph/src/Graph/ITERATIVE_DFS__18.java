package Graph;

import java.io.*;
import java.util.*;

public class ITERATIVE_DFS__18 
{
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }
   
   public static class Pair
   {
       int v;
       String psf;
       
       Pair(int v ,String psf)
       {
           this.v=v;
           this.psf=psf;
       }
   }

   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

      int vtces = Integer.parseInt(br.readLine());
      ArrayList<Edge>[] graph = new ArrayList[vtces];
      for (int i = 0; i < vtces; i++) {
         graph[i] = new ArrayList<>();
      }

      int edges = Integer.parseInt(br.readLine());
      for (int i = 0; i < edges; i++) {
         String[] parts = br.readLine().split(" ");
         int v1 = Integer.parseInt(parts[0]);
         int v2 = Integer.parseInt(parts[1]);
         graph[v1].add(new Edge(v1, v2));
         graph[v2].add(new Edge(v2, v1));
      }

      int src = Integer.parseInt(br.readLine());

      /*
      
          7         vertex
          8         edge
          0 1 10
          1 2 10
          2 3 10
          0 3 10
          3 4 10
          4 5 10
          5 6 10
          4 6 10
          2         source
      
          output
          2@2
          3@23
          4@234
          6@2346
          5@23465
          0@230
          1@2301
      
      */
      
      boolean[] visited = new boolean[vtces];
      Stack<Pair> st = new Stack<>();
      
      st.add(new Pair(src, src+""));
      
      while(st.size()>0)
      {
          Pair rem = st.pop();
          
          if(visited[rem.v]== true)
          {
              continue;
          }
          visited[rem.v]=true;
          
          System.out.println(rem.v + "@" + rem.psf);
          
          for(Edge e: graph[rem.v])
          {
              if(visited[e.nbr]==false)
              {
                  st.push(new Pair(e.nbr, rem.psf+e.nbr));
              }
          }
      }
      
      
      
   }
}