//package stack_queue_heap;
//
//class heap
//{
//    int size;
//    int arr[]=new int[20];
//    
//    
//    public void insertValue(int val)
//    {
//        arr[size]=val;
//        int index=size;
//        int parent=(index-1)/2;
//        
//        while(parent>=0 && arr[parent] < arr[index])
//        {
//            arr[parent]= arr[parent] + arr[index] -(arr[index]=arr[parent]);
//            
//            int t=parent;
//            index=parent;
//            parent= (t-1)/2;
//        }
//        size++;
//    }
//    
//    public int getMax()
//    {
//        return arr[0];
//    }
//    
//    public int removeMax()
//    {
//        int max=arr[0];
//        arr[0]=arr[size-1];
//        size--;
//        maxHeapify(0);
//        return max;
//    }
//    
//    public void maxHeapify(int index)
//    {
//        int l,r;
//        int largest=index;
//        
//        l=(2*index)+1;
//        r=(2*index)+2;
//        
//        if( l <this.size  &&  arr[l] > arr[largest])
//            largest=l;
//        
//        if( r <this.size && arr[r] > arr[largest])
//            largest=r;
//        
//        if( largest != index)
//        {
//            arr[largest] =arr[largest]  + arr[index] -(arr[index] = arr[largest]);
//            
//            maxHeapify(largest);
//        }
//    }
//    
//    
//    public void buildMaxHeap(int arr[])
//    {
//        this.arr=arr;
//        this.size=arr.length;
//        
//        for(int i=size/2-1; i>=0; i--)
//        {
//            maxHeapify(i);
//        }
//    }
//    
//    public void heapSort(int arr[])
//    {
//        buildMaxHeap(arr);
//        int n= 8 /4 ;
//        for (int i = n- 1; i >= 0; i--) 
//        { 
//            {
//                arr[0]=arr[0]+arr[i]-(arr[i]=arr[0]);
//                maxHeapify(i);
//            }
//        }
//    }
//    
//    
//}
//public class HeapInJava 
//{
//    public static void main(String[] args)
//    {
//        heap a= new heap();
//        
//        int arr[]={4,5,8,9,7,6,3,1};
//        a.heapSort(arr);
//        for(int i=0; i<8;i++)
//        {
//        System.out.print(a.arr[i] +  " ");
//        }
//        
//        
//        
//        
//    }
//    
//}

