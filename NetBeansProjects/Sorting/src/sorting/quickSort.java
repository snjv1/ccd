package sorting;
public class quickSort {
    public static void main(String[] args) 
    {
        int arr[]={5,4,3,2,1};
        quickSort(arr,0,arr.length-1);
        
        for(int i=0;i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
        
    }
    
    public static void quickSort(int[] arr, int lo, int hi) {
    if (lo > hi) {
      return;
    }
    int pivot = arr[hi];
    int pidx = partition(arr, pivot, lo, hi);
    quickSort(arr, lo, pidx - 1);
    quickSort(arr, pidx + 1, hi);
  }

  public static int partition(int[] arr, int pivot, int lo, int hi) 
  {
    int i = lo, j = lo;
    while (i <= hi) 
    {
      if (arr[i] <= pivot) 
      {
        swap(arr, i, j);
        i++;
        j++;
      }
      else 
      {
        i++;
      }
    }
    return (j - 1);
  }

  // used for swapping ith and jth elements of array
  public static void swap(int[] arr, int i, int j)
  {
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }

}

