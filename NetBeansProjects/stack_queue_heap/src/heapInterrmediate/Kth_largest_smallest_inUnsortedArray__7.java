package heapInterrmediate;
public class Kth_largest_smallest_inUnsortedArray__7 
{
    public static void main(String[] args) 
    {
    int arr[]={7,55,32,10,4,3,53,19,20,15,55};
    int size=arr.length;
    int k=4;
            
    heapSort(arr,size);
    for(int i=0;i<size;i++)
    {
        System.out.print(arr[i]+" ");
    }
        System.out.println("");
            

    
    // Kth largest element and Kth smallest element are
        System.out.println("Kth smallest no " + arr[k-1]);  
        System.out.println("Kth largest no " + arr[size-k]);    
        
    }
    
    static void heapSort(int arr[], int n)
    {
        for(int i=n/2-1; i>=0; i--)
        {
            heapify(arr,n,i);
        }
        
        for(int i=n-1; i>=0; i--)
        {
            int temp= arr[i];
            arr[i]=arr[0];
            arr[0]=temp;
            
            heapify(arr,i,0);
        }
    }
    // here we created max heap
    static void heapify(int arr[], int n ,int i)
    {
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        
        if(left<n && arr[left]>arr[largest])
            largest=left;
        if(right<n && arr[right]>arr[largest])
            largest=right;
        
        if(largest!=i)
        {
            int temp=arr[i];
            arr[i]=arr[largest];
            arr[largest]=temp;
            
            heapify(arr,n,largest);
        }
        
    }
}
        

