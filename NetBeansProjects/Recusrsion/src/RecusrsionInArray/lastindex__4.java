package RecusrsionInArray;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import static RecusrsionInArray.firstIndex_3.firstIndex;

public class lastindex__4 
{
    public static void main(String[] args) throws Exception {
        
        /*
        10     N
        
        2
        3
        6
        9
        7
        8
        3
        2
        3
        6
        
        3   X
        */
        
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int[] arr= new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        
        int x= Integer.parseInt(br.readLine());
        
        int result =lastIndex(arr,0,x);
        System.out.println("");
        System.out.println(result);
        
    }
     public static int lastIndex(int[] arr, int idx, int x)
     {
         
         if(idx==arr.length)
             return -1;
         
         int lidx=lastIndex(arr,idx+1,x);
         if(lidx==-1)
         {
             if(arr[idx]==x)
                 return idx;
             else
                 return -1;
         }
         else
             return lidx;
         
         
     }
}
