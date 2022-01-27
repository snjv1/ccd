package Graph;

import java.util.ArrayList;

public class getConnectedComponents__5 
{
    static class Edge{
        int src,nbr,wt;
        
        Edge(int src, int nbr, int wt)
        {
            this.src=src;
            this.nbr=nbr;
            this.wt=wt;
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
      
      graph[0].add(new Edge(0,1,40));

      graph[2].add(new Edge(2,3,10));
      
      graph[4].add(new Edge(4,5,3));
      graph[4].add(new Edge(4,6,3));
      
      graph[5].add(new Edge(5,4,3));
      graph[5].add(new Edge(5,6,3));
      
      graph[6].add(new Edge(6,5,3));
      graph[6].add(new Edge(6,4,8));
      
      ArrayList<ArrayList<Integer>> components = new ArrayList<>();
      boolean[] visited = new boolean[vtces];
      
      for(int i=0; i<vtces; i++)
      {
          if(visited[i] == false)
          {
              ArrayList<Integer> comp = new ArrayList<>();
              drawTreeAndGetComponent(graph, i , comp, visited);
              components.add(comp);
          }
      }
        System.out.println(components);
      
      

    }    
      public static void drawTreeAndGetComponent(ArrayList<Edge>[] graph, int src, ArrayList<Integer> comp,boolean[] visited)
      {
        
          visited[src]=true;
          comp.add(src);
          for(Edge e : graph[src])
          {
              if(visited[e.nbr]==false)
              {
                  drawTreeAndGetComponent(graph,e.nbr,comp,visited);
              }
          }
      }
}
