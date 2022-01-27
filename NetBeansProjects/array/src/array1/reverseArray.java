
package array1;

public class reverseArray {
    public static void main(String[] args) {
      int arr[]={10,50,46,82,47,12,36,69};
      firstMethod(arr);
      secondMethod(arr,arr.length);
    }
       
   
      static void firstMethod(int[] a)
      {
    for(int i=0;i<a.length;i++)
        System.out.print(a[i] + " ");
          System.out.println();
    
        
    for (int i = a.length-1; i >= 0; i--)
            System.out.print(a[i]+ " ");
    System.out.println();
      }
      
      
      static void secondMethod(int a[],int n)
      {
          int t;
          for(int i=0;i<n/2;i++)
          {
            t=a[i];
            a[i]=a[n-i-1];
            a[n-i-1]=t;
          }
          for(int i=0;i<n;i++)
          System.out.println("reverse array is " + a[i]+ " ");
          
         
          
      }
      }
    
   