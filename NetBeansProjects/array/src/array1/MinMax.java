
package array1;


public class MinMax {
    
    public static void main(String[] args) {
        int[] array = {1,2,54,7,354,14,52};
        int n=array.length;
        System.out.println("minimum element is "+ getMin(array,n));
        System.out.println("maximum array element is " + getMax(array,n));
    }


static int getMin(int[] array,int n)
    {
        int res=array[0];
        for(int i=1;i<n;i++)
        
           res=Math.min(res,array[i]);
        return res;
    }
  
  static int getMax(int[] array,int n)
  {
      int res=array[0];
        for(int i=1;i<n;i++)
           res=Math.max(res,array[i]);
        return res;
  }}