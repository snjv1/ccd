package Graph;

import java.io.*;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;

public class isGraphBipartite__13 
{
    
    static class Edge
    {
        int src,nbr,wt;
        
        Edge(int src,int nbr,int wt)
        {
            this.src=src;
            this.nbr=nbr;
            this.wt=wt;
        }
    }
    
    static class Pair
    {
        int v;
        String psf;
        int level;
        
        Pair(int v, String psf ,int level)
        {
            this.v=v;
            this.psf=psf;
            this.level=level;
        }
    }
    
    
    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        
        int vtces=Integer.parseInt(br.readLine());
        ArrayList<Edge>[] graph = new ArrayList[vtces];
        for(int i=0; i<vtces; i++)
        {
            graph[i] = new ArrayList<>();
        }
        
        int edge = Integer.parseInt(br.readLine());
        for(int i=0; i<edge ;i++)
        {
            String[] parts = br.readLine().split(" ");
            int v1= Integer.parseInt(parts[0]);
            int v2 = Integer.parseInt(parts[1]);
            int wt = Integer.parseInt(parts[2]);
            
            graph[v1].add(new Edge(v1,v2,wt));
            graph[v2].add(new Edge(v2,v1,wt));
        }
        
        /*
        pre requiste   BFS QTN      pre requiste   BFS QTN
        pre requiste   BFS QTN      pre requiste   BFS QTN
        pre requiste   BFS QTN      pre requiste   BFS QTN
        
        */
        
        
        /*
        
        7
        8
        0 1 10
        1 2 10
        2 3 10
        0 3 10
        3 4 10
        4 5 10
        5 6 10
        4 6 10
        
        */
        
        
        int[] visited = new int[vtces];
        Arrays.fill(visited,-1);                    // pure array m -1 daal diya jse hi visit krenge to level daal denge
        for(int v=0; v<vtces; v++ )
        {
            if(visited[v]==-1)          // mtlb -1 h to visited nhi h  -1 ke alwa or kuch h to visited h
            {
                boolean isCompBipartite = checkBipartite(graph, v ,visited);
                if(isCompBipartite==false)
                {
                    System.out.println("false  not Bipartite");
                    return;
                }
            }
        }
        System.out.println("ture it is a Bipartite");
}
    
    public static boolean checkBipartite(ArrayList<Edge>[] graph , int src ,int[] visited)
    {
        ArrayDeque<Pair> q = new ArrayDeque<>();
        q.add(new Pair(src, src+"" , 0));   // src , path, level
        
        while(q.size()>0)
        {
            Pair rem= q.removeFirst();
            
            if(visited[rem.v]!= -1)   //vha p -1 nhi h to  koi koi level hoga mtlb visited h /////// agr visited h to check kro ki phle visited level or abb visited level dono same h to BIPARTITE h
            {                            // and phle visited level and dubara visited level  diffnt h to bipartite nhi h 
                if(rem.level != visited[rem.v])
                {
                    
                    return false;
                }
            }
            
            else        // visited nhi h to visit krdo 
            {
                visited[rem.v]=rem.level;        
            }
            
            for(Edge e: graph[rem.v])       // removed value ke neighbour agr visited nhi h to unke queue m add krenge vrna aage bdhenge 
            {
                if(visited[e.nbr]==-1)
                {
                    q.add(new Pair(e.nbr , rem.psf + e.nbr , rem.level+1));
                }
            }
        }
        
        return true;            // agr khi bhi bipartate ki property false nhi ho pati h or queue empty ho jaye mtlb BIPARTITE h
    }
}
        
