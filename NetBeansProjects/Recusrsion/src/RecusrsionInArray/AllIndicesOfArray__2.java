
package RecusrsionInArray;

import java.io.*;

public class AllIndicesOfArray__2 
{
    public static void main(String[] args) throws Exception {
        /*
        6    n
        15
        11
        40
        4
        4
        9
        4    to find indices of 4
        */
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n= Integer.parseInt(br.readLine());
        int[] arr= new int[n];
        
        for(int i=0; i<n; i++)
        {
            arr[i]=Integer.parseInt(br.readLine());
        }
        
        int x= Integer.parseInt(br.readLine());
        
        int[] iarr= allIndices(arr,x,0,0);
        System.out.println("");
        for(int i=0; i<iarr.length; i++)
        {
            System.out.println("found at index" +iarr[i]);
        }
        
        
    }
    
    public static int[] iarr;
     public static int[] allIndices(int[] arr, int x, int idx, int fsf) {
         {
             
             if(idx==arr.length)
                 return new int[fsf];
             
             if(arr[idx]==x)
             {
                 iarr = allIndices(arr,x,idx+1,fsf+1);
                 iarr[fsf]=idx;
                 return iarr;
             }
             else
             {
                 iarr = allIndices(arr,x,idx+1,fsf);
                 return iarr;
             }

         }
}
}
