package heapInterrmediate;
public class heapSort__6 
{
    public static void main(String[] args) 
    {
        int arr[]= {9,5,2,6,4,7,3};
        int n=arr.length;
        heapSort(arr,n);
        
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        
    }
    
    static void heapSort(int arr[], int n)
    {
      for(int i=n/2-1; i>=0; i--)  
      {
          heapify(arr,n,i);
      }
      
      for( int i=n-1; i>=0; i--)
      {
          int temp=arr[i];
          arr[i]=arr[0];
          arr[0]=temp;
          
          heapify(arr,i,0);     // hrr iteration ke sath size -- hota jaeyga isliye n ki jgh is m hm i index bhej rhe h mtlb ki ith element tk hi heapify krna h 
      }
      
    }
    
    static void heapify(int arr[],int n, int i )
    {
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        
        if(left < n && arr[left]> arr[largest])
            largest=left;
        
        
        if(right < n && arr[right]>arr[largest])
            largest=right;
        
        if(largest!=i)
        {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;
             
            heapify(arr,n,largest);
        }
        
       
    }
}
