/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graph;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 *
 * @author sanje
 */
public class Prims_Algorithm__16 {
    
   static class Edge {
      int src;
      int nbr;
      int wt;

      Edge(int src, int nbr, int wt) {
         this.src = src;
         this.nbr = nbr;
         this.wt = wt;
      }
   }
   
   static class Pair implements Comparable<Pair>  {
      int v;
      int acqV;
      int wt;

      Pair(int v, int acqV, int wt) {
         this.v = v;
         this.acqV = acqV;
         this.wt=wt;
      }

        public int compareTo(Pair o) {
            return this.wt - o.wt;
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
         int wt = Integer.parseInt(parts[2]);
         graph[v1].add(new Edge(v1, v2, wt));
         graph[v2].add(new Edge(v2, v1, wt));
      }

      /*
      
          7             vtces     
          8             edges
          0 1 10
          1 2 10
          2 3 10
          0 3 40
          3 4 2
          4 5 3
          5 6 3
          4 6 8

      
            output
            [1-0@10]
            [2-1@10]
            [3-2@10]
            [4-3@2]
            [5-4@3]
            [6-5@3]
      */
      
        System.out.println("");
      boolean[] visited= new boolean[vtces];
      PriorityQueue<Pair> pq= new PriorityQueue<>();
      
      pq.add(new Pair(0, -1, 0)); // src , src ka path , src ka weight
      
      while(pq.size()>0)
      {
          Pair rem= pq.remove();
          
          if(visited[rem.v]==true)
          {
              continue;
          }
          
          visited[rem.v]=true;
          if(rem.acqV != -1)
          {
          System.out.println(rem.v +"- " + rem.acqV +"@ " + rem.wt);
          }
          
          for(Edge e:graph[rem.v])
          {
              if(visited[e.nbr]== false)
              {
                  pq.add(new Pair(e.nbr , rem.v , e.wt));
              }
          }
          
      }
   }
}
