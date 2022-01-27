package stackIntermediate;

import java.io.*;
import java.util.Arrays;
import java.util.Stack;

public class MergeOverlappingInterval__15 
{
    public static void main(String[] args) throws Exception 
    {
        /*
        6    totsl no of interval
        22 28
        1 8
        25 27
        14 19
        27 30
        5 12
        */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[][] arr= new int[n][2];
        
        for(int i=0; i<n; i++)
        {
            String line  =br.readLine();
            arr[i][0] = Integer.parseInt(line.split(" ")[0]);
            arr[i][1] = Integer.parseInt(line.split(" ")[1]);
        }
                mergeOverlappingIntervals(arr);
    }
    
    public static class Pair implements Comparable<Pair>  {
        int st;
        int end;
        
        Pair(int st, int end) 
        {
            this.st=st;
            this.end=end;
        }

        
        public int compareTo(Pair other) {
            if(this.st != other.st)
            {
                return this.st-other.st;
            }
            else
            {
                return this.end-other.end;
            }
        }
    }

    public static void mergeOverlappingIntervals(int[][] arr) {
        // merge overlapping intervals and print in increasing order of start time
        
        Pair[] pairs = new Pair[arr.length];
        for(int i=0; i< arr.length; i++)
        {
            pairs[i]= new Pair(arr[i][0], arr[i][1]);
        }
        
        Arrays.sort(pairs);
        
        Stack<Pair> st = new Stack<>();
        for(int i=0 ; i<pairs.length ; i++)
        {
            if(i==0)
                st.push(pairs[i]);
            else
            {
                Pair top = st.peek();
                
                if(pairs[i].st > top.end)
                {
                    st.push(pairs[i]);
                }
                else
                {
                    top.end = Math.max(pairs[i].end, top.end);
                }
            }
        }
        System.out.println("");
        while(st.size()>0)
        {
            Pair p =st.pop();
            System.out.println(p.st+" "+p.end);
        }
    }
    

}