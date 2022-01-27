package Graph;

import java.io.*;
import java.util.*;

public class spreadInfection__14 
{
    
    
    /*
        7           vertex
        8           edge          
        0 1 10      graph
        1 2 10
        2 3 10
        0 3 10
        3 4 10
        4 5 10
        5 6 10
        4 6 10
        6               src where person get start infected
        3               time limit
    */
    
     static class Edge
    {
        int src,nbr;
        
        Edge(int src,int nbr)
        {
            this.src=src;
            this.nbr=nbr;
            
        }
    }
    
    static class Pair
    {
        int v;
        int time;        
        
        Pair(int v,int time)
        {
            this.v=v;
            this.time=time;
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

      /*
      
          7          vtces
          8          edge
          0 1 10
          1 2 10
          2 3 10
          0 3 10
          3 4 10
          4 5 10
          5 6 10
          4 6 10
          6         src 
          3         time t
      */
      int src = Integer.parseInt(br.readLine());
      int t = Integer.parseInt(br.readLine());
      
      int[] visited =new int[vtces];       //pure array m intitially 0 h hr position o
                                        // visited m hm TIME T save krenge ki kis T p wo infected hua h
      int count=0;                          // count total no of patient in T interval of TIme
      ArrayDeque<Pair> q= new ArrayDeque<>();
      
      q.add(new Pair(src ,1));          // src =6, time interval is 1
      
      while(q.size()>0)
      {
          Pair rem= q.removeFirst();        // first infected ko remove kra check krenge ki mark h ya nhi 
          
          if(visited[rem.v] > 0)        // >0 mtlb vha p koi Time T h mtlb phle se visited(infected) h
          {
              continue;             // phle se infected h to aage pdho
          }
          
          visited[rem.v]=rem.time;          //visited nhi h to Time t ke liye visit kra do
          if(rem.time > t)              // rempve element ka time are given TIME T se jyada ho jaye to break kr do
          {
              break;
          }
          count++;
          
          for(Edge e:graph[rem.v])
          {
              if(visited[e.nbr]== 0)  // remove element k neighbour agr visited nhi h to visit kro or unhe queue m add kro
              {
                  q.add(new Pair(e.nbr, rem.time+1));       // remove elemenr ke time m +1 krke daaldo
              }
          }
      }
         System.out.println("Total no of infected person are "+count );
     }
}
