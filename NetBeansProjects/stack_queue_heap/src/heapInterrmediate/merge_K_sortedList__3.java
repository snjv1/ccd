package heapInterrmediate;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class merge_K_sortedList__3 
{
       
    public static void main(String[] args) {

        
        //expeceted output 1 2 3 5 7 9 10 11 19 20 30 32 39 40 50 55 57 
        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(10);
        list1.add(20);
        list1.add(30);
        list1.add(40);
        list1.add(50);
        
        ArrayList<Integer> list2= new ArrayList<>();
        list2.add(5);
        list2.add(7);
        list2.add(9);
        list2.add(11);
        list2.add(19);
        list2.add(55);
        list2.add(57);
        
        ArrayList<Integer> list3= new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        
        ArrayList<Integer> list4= new ArrayList<>();
        list4.add(32);
        list4.add(39);
         
        ArrayList<ArrayList<Integer>> lists = new ArrayList<>();
        lists.add(list1);
        lists.add(list2);
        lists.add(list3);
        lists.add(list4);

       ArrayList<Integer> mlist = mergeKSortedLists(lists);
      for(int val: mlist){
         System.out.print(val + " ");
      }
      System.out.println();
        
    }
    
        
    
    public static class Pair implements Comparable<Pair>
    {
        int li;
        int di;
        int val;
        
        Pair(int li, int di, int val)
        {
            this.li=li;
            this.di=di;
            this.val=val;
        }
        
        public int compareTo(Pair o)   //jiski negative value hogi vo chota hota h
        {
            return this.val-o.val;
        }
    }
    
       public static ArrayList<Integer> mergeKSortedLists(ArrayList<ArrayList<Integer>> lists)
       {
           ArrayList<Integer> result = new ArrayList<>();
           
           
           PriorityQueue<Pair> pq= new PriorityQueue<>();
           for( int i=0; i<lists.size();i++)        // hr list ka 1 lement queue m daal dega
           {
              Pair p= new Pair(i,0,lists.get(i).get(0));   // i list m 0th element p 0th val
              pq.add(p);
              
           }
           
           
           while(pq.size()>0)
           {
               Pair removedPair=pq.remove(); 
               result.add(removedPair.val);   // remove element ki value ko add kra final list m
               removedPair.di++;          // usi element ke next index p gyee
               
               if(removedPair.di < lists.get(removedPair.li).size())   // jo pair p ki value h kya uske next di index p value h ya uska size itna h bhi ya nhi agr h to queue m add kr do
               {
                   removedPair.val=lists.get(removedPair.li).get(removedPair.di);
                   pq.add(removedPair);
               }
           }
           
           return result;
       }
    
            
            
         
}
