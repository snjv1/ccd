
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heapInterrmediate;

import java.util.ArrayList;

/**
 *
 * @author sanje
 */
public class priorityQueueusingHeap__4 {
    
    static class Student implements Comparable<Student>
    {
        int rno;
        int ht;
        int wt;
        
        Student(int rno, int ht, int wt)
        {
            this.rno=rno;
            this.ht=ht;
            this.wt=wt;
        }
        
        public int compareTo(Student o)
        {
            return this.rno-o.rno;
        }
        
        public String toString()
        {
            return "Rno = "+ this.rno +", wt =  "+ this.wt + ", ht = "+this.ht;
        }
                
        
    }
    
    public static void main(String[] args) {
        
        /*
        EXPECTED OUTPUT
10
10
10
20
20
30
30
40
40
50

        */
    
        int arr[]= {10,2,17,3,18,9,22};
        priorityQueue pq= new priorityQueue();
            pq.add(new Student(10,180,81));
            pq.add(new Student(2,185,85));
            pq.add(new Student(12,170,84));
            pq.add(new Student(18,179,88));
            pq.add(new Student(7,182,82));
    
            while(pq.size() >0)
            {
                System.out.println(pq.peek());
                pq.remove();
            }
        
    }

    
    

    public static class priorityQueue<T>
    {
        ArrayList<T> data;
        
    
    
    public priorityQueue()
    {
        data= new ArrayList<>();
    }
    private boolean isSmaller(int i , int j)
    {
        Comparable ith = (Comparable)data.get(i);
        Comparable jth = (Comparable)data.get(j);
        if(ith.compareTo(jth) < 0)
            return true;
        else
            return  false;
    }
    public void add(T val)
    {
        data.add(val);              // last  m aadd krdo or heapify krdo ho SKTA H KI LAST M CHOTI VALUE ADD HO GYI hO
        upHeapify(data.size()-1);     //last index se shuru krenge hop maintain krna  kuki last m element add hua h
    }
    
    private void upHeapify(int i)
    {
        if(i==0)
            return;
        int parent=(i-1)/2;          // jo bhi element h uska parent nikal liya 
        if(isSmaller(i,parent))    // agr vo apne parent se chota h to swap krdo 
            swap(i,parent);
        upHeapify(parent);                  // again abb swap ke baad parent ke liye heapify jb HOP property balance na ha jaye
        
    }
    
    private void swap(int i, int j)
    {
        T ith=data.get(i);
        T jth = data.get(j);
        data.set(i, jth);
        data.set(j,ith);
    }
    
    public T remove()
    {
        if(this.size()==0)
        {
            System.out.println("underflow");
            return null;
        }
         
        swap(0,data.size()-1);
        T val = data.remove(data.size()-1);
        downHeapify(0);
        return val;
    }
    
    private void downHeapify(int parent)
    {
        int min= parent;            // let kr liya ki parent hi sbse chota element h
        
        // ab left right and parent m se sbse chota nikalenge or jo sbse chota hoga uske sath parent ko replace kr denge   ASA KRNE SE BDA ELEMENT NICCHE CHLA JAEYGA OR SBSE CHOTA UPR AA JAEYGA  KUKI PARENT APNE DONO CHILD SE BDA HONA CHAHIYE 
        
        int leftChild =2*parent +1;        
        if( leftChild< data.size()  &&  isSmaller(leftChild,min)==true)    // check ki left child h ya nhi and jo left chld h vo min se chota h ya nhi
        {
            min=leftChild;                                                                  // agr left child min se chota h to left ko min bna do
        }
        
        int rightChild =2*parent+2;
        if( rightChild< data.size()  &&  isSmaller(rightChild,min)==true)              // check ki RIGHT child h ya nhi and jo right chld h vo min se chota h ya nhi
        {
            min=rightChild;
        }
        
        if(min!=parent)                                                                 // agr parent or min dono ek hi element nhi h to unko swpa kr do
        {
            swap(parent,min);
            downHeapify(min);                       // jb tk krenge jb tk HOP  balance na ho jaye 
        }
        
    }
    
    public T peek()
    {
        if(this.size()==0)
        {
            System.out.println("underflow");
            return null;
        }
        else
          return  data.get(0);
    }
    
    public int size()
    {
        return data.size();
    }
    
    
    
    }
    
    
    
}
