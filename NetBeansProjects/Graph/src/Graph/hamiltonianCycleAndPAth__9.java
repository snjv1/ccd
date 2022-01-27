package Graph;

import java.util.ArrayList;
import java.util.HashSet;

public class hamiltonianCycleAndPAth__9 
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
      graph[3].add(new Edge(3,4,10));
      
      graph[4].add(new Edge(4,3,10));
      graph[4].add(new Edge(4,5,10));
      graph[4].add(new Edge(4,6,10));
      
      graph[5].add(new Edge(5,2,10));
      graph[5].add(new Edge(5,4,10));
      graph[5].add(new Edge(5,6,10));
      
      graph[6].add(new Edge(6,4,10));
      graph[6].add(new Edge(6,5,10));
      
      int src=0;
      HashSet<Integer> visited = new HashSet<>();
      hamiltonian(graph,src,visited,src+"",src);
    }
    
    public static void hamiltonian(ArrayList<Edge>[] graph, int src, 
                                    HashSet<Integer> visited,String psf , int orsrc)
    {
        if(visited.size()== graph.length-1)
        {
            System.out.print(psf);
            
            
            boolean closingEdgeFound =false;
            for(Edge e: graph[src])
            {
                if(e.nbr==orsrc)
                {
                    closingEdgeFound=true;
                    break;
                }
            }
            
            if(closingEdgeFound == true)
            {
                System.out.println("*");
            }
            else
            {
                System.out.println(".");
            }
            System.out.println();
                return;
        }
        visited.add(src);
        for(Edge e: graph[src])
        {
            if(visited.contains(e.nbr)==false)
            {
                hamiltonian(graph,e.nbr,visited,psf+e.nbr,orsrc);
            }
        }
        visited.remove(src);
    }
    
   
}
