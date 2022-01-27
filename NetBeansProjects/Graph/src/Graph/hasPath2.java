package Graph;


import java.util.ArrayList;

public class hasPath2 
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
      
      graph[0].add(new Edge(0,1,10));
      graph[0].add(new Edge(0,3,10));
      
      graph[1].add(new Edge(1,0,10));
      graph[1].add(new Edge(1,2,10));
            
      graph[2].add(new Edge(2,1,10));
      graph[2].add(new Edge(2,3,10));
      graph[2].add(new Edge(2,5,10));
      
      graph[3].add(new Edge(3,0,10));
      graph[3].add(new Edge(3,2,10));
      
      graph[4].add(new Edge(4,5,10));
      graph[4].add(new Edge(4,6,10));
      
      graph[5].add(new Edge(5,2,10));
      graph[5].add(new Edge(5,4,10));
      graph[5].add(new Edge(5,6,10));
      
      graph[6].add(new Edge(6,4,10));
      graph[6].add(new Edge(6,5,10));
      
      int src=0;
      int dest=6;
      boolean[] visited= new boolean[vtces];
      
      boolean path=hasPath(graph,src,dest,visited);
        System.out.println(path);
      
    }
    
    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest,boolean[] visited)
    {
        if(src==dest)
            return true;
        
        visited[src]=true;
        for(Edge e : graph[src])
        {
            if(visited[e.nbr]==false)
            {
                boolean hasNbrPath= hasPath(graph,e.nbr,dest,visited);
                if(hasNbrPath == true)
                {
                    return true;
                }
            }
        }
        
        return false;
    }
}
