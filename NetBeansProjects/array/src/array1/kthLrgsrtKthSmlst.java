package array1;
import java.util.*;   // prgrm to find 
public class kthLrgsrtKthSmlst {      
    public static void main(String[] args) {
          ///// using heap sort qtn no 7 in heap 
   ///// using heap sort qtn no 7 in heap 
   ///// using heap sort qtn no 7 in heap 
   ///// using heap sort qtn no 7 in heap 
   ///// using heap sort qtn no 7 in heap 
   ///// using heap sort qtn no 7 in heap 
   ///// using heap sort qtn no 7 in heap 
   ///// using heap sort qtn no 7 in heap 
        
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  a no to find kth smallest and Kth largest no");
        int k=sc.nextInt();
        int[] array={8,65,55,12,200,45,623,68,78,915,2468,4};       //      
        smallestLargest(array,k);
       
          }
    
   public static void smallestLargest(int[] a,int k)
   {
      Arrays.sort(a);
       System.out.println( " sorted elements are" + Arrays.toString(a));
      System.out.println(" Kth smallest no " + a[k-1]);  
       System.out.println(a.length);
      System.out.println(" Kth largest no " + a[a.length-k]);    
   }
   
   
   ///// using heap sort qtn no 7 in heap 
   ///// using heap sort qtn no 7 in heap 
   ///// using heap sort qtn no 7 in heap 
   ///// using heap sort qtn no 7 in heap 
   ///// using heap sort qtn no 7 in heap 
   ///// using heap sort qtn no 7 in heap 
   ///// using heap sort qtn no 7 in heap 
   ///// using heap sort qtn no 7 in heap 
   
   
   
  
}