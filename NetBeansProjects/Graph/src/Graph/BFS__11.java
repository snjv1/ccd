package Graph;

import java.io.*;
import java.util.*;

public class BFS__11 
{
    
   static class Edge {
      int src;
      int nbr;

      Edge(int src, int nbr) {
         this.src = src;
         this.nbr = nbr;
      }
   }

   static class Pair
   {
       int v;
       String psf;
       
       Pair(int v, String psf)
       {
           this.v=v;
           this.psf=psf;
       }
   }
   public static void main(String[] args) throws Exception {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      /*
          7  vtces
          8  edge
          0 1 10
          1 2 10
          2 3 10
          0 3 10
          3 4 10
          4 5 10
          5 6 10
          4 6 10
          2  src
      */
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
        R M* W A*
      
      remove   mark(*)visited   write path   add neighbour (which are not visited)
      agr phle se visited h to aage bdhenge  vrna

      */
       System.out.println("");
      ArrayDeque<Pair> queue = new ArrayDeque<>();
      queue.add( new Pair(src, src+""));    // source and source ka path daal do 
      boolean[] visited = new boolean[vtces];
      
      while(queue.size() >0)      // jb tk queue empty na ho jaye tb tk   R M* W A*
      {
          Pair rem = queue.removeFirst();       // 1 remove kro
          
          if(visited[rem.v] == true)           //  2  agr remove element  phle se visited h to aage bdh jayenge
          {
              continue;
          }
          visited[rem.v] = true;              //   3  visited nhi h to visit kre
          System.out.println(rem.v + "@" + rem.psf);       // 4  new path print kre 
          
          for(Edge e :graph[rem.v])        // 5  remove element ke neighbours ko dekhenge agr visited nhi h to queue m add krdo
          {
              if(visited[e.nbr]==false)
              {
                  queue.add(new Pair (e.nbr , rem.psf + e.nbr));
              }
          }
      }
      
   }
}

