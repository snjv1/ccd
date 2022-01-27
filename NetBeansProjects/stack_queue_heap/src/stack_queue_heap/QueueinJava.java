package stack_queue_heap;

import java.util.ArrayList;
//
//class Queuess
//{
//    private static int front,rear,capacity;
//    private static int queue[];
//    
//    Queuess(int c)
//    {
//        front=rear=0;
//        capacity=c;
//        queue=new int[capacity];
//    }
//    
//    
//    public void enqueue(int data)
//    {
//        if(rear==capacity)
//        {
//            System.out.println("Queue if full");
//            return;
//        }
//        else
//        {
//            queue[rear++]=data;
//        }
//        return;
//    }
//    
//     public  void dequeue()
//      {
//          if(front==rear)
//          {
//              System.out.println("queue is empty");
//              return;
//          }
//          
//          else
//          {
//              for(int i=0; i<rear-1;i++)
//                  queue[i]=queue[i+1];
//              
//              if(rear<capacity)
//                  queue[rear]=0;
//              
//              rear--;
//          }
//          return;
//      }
//      
//     public  void queueDisplay()
//      {
//          if(front==rear)
//          {
//              System.out.println("queue is empty");
//              return;
//          }
//          
//          for(int i=front;i<rear;i++)
//          {
//              System.out.print(queue[i]+" ");
//          }
//          return;
//      }
//      
//     public  void queueFront()
//      {
//          if(front==rear)
//          {
//              System.out.println("queue is empty");
//              return;
//          }
//          System.out.println("Front element is" + queue[front] );
//          return;
//      }
//     
//}



class circularQueue
{
    private int size,rear,front;
    private ArrayList<Integer> cQueue = new ArrayList<>();
    
    circularQueue(int size)
    {
        this.size=size;
        front=rear=-1;
    }
    
    public void cEnqueue(int data)
    {
        if(front==0 && rear==size-1 || rear==front-1)
            System.out.println("cQuque is full ");
        
        else if(front==-1)
        {
            rear=front=0;
            cQueue.add(rear,data);
            
        }
        else if(rear==size-1 && front!=0)
        {
            rear=0;
            cQueue.set(rear,data);
        }
        else
        {
            rear++;
            
              if(front <= rear) 
        { 
            cQueue.add(rear, data); 
        } 
      
        // Else updating old value 
        else
        { 
            cQueue.set(rear, data); 
        }
            
        }
            
    }
    
    public int cDequeue()
    {
        int temp;
        
        if(front==-1)
        {
            System.out.println("empty queue");
            return-1;
        }
        
        temp=cQueue.get(front);
        
        if(front==size-1)
        {
            front=0;
        }
        
        else if(front==rear)
        {
            rear=front=-1;
        }
        
        else
        {
            front++;
        }
        return temp;
                
    }
    
    
    
    public void cDisplay()
    {
        if(front==-1)
        {
            System.out.println("queue is empty");
            return;
        }
        
        
    // If rear has not crossed the max size 
    // or queue rear is still greater then 
    // front.
        if(rear>=front)
        {
            for(int i=front; i<=rear;i++)
            {
                System.out.print(cQueue.get(i) + " ");
            }
        }
        
        else
        {
         
             // Loop for printing elements from 
        // front to max size or last index 
        for(int i = front; i < size; i++) 
        { 
            System.out.print(cQueue.get(i)+" "); 
            System.out.print(" "); 
        } 
  
        // Loop for printing elements from 
        // 0th index till rear position 
        for(int i = 0; i <= rear; i++) 
        { 
            System.out.print(cQueue.get(i)+" "); 
            System.out.print(" "); 
        } 
        }
            
        
    }
            
}
        

public class QueueinJava 
{
    public static void main(String[] args) 
    {
//        Queuess q = new Queuess(4); 
//        q.queueDisplay();
//  
//        q.enqueue(20);
//        q.enqueue(30);
//        q.enqueue(40);
//        q.dequeue();
//        System.out.println();
//        q.queueDisplay();
//        System.out.println();
//        q.enqueue(60);
//        
//        q.queueFront();
//        q.dequeue();
//        System.out.println();
//        q.enqueue(60);
//        q.queueDisplay();
//        q.enqueue(70);
//        
        
        
           circularQueue q = new circularQueue(5); 
      
    q.cEnqueue(14);
    q.cEnqueue(22); 
    q.cEnqueue(13); 
    q.cEnqueue(-6); 
      
    q.cDisplay(); 
        System.out.println();
  
    int x = q.cDequeue(); 
  
        System.out.print("Deleted value is " + x); 
        
        System.out.println();
    q.cDisplay(); 
        System.out.println();
      
    q.cEnqueue(9); 
    q.cEnqueue(20); 
    q.cEnqueue(5); 
     
        System.out.println();
    q.cDisplay(); 
        System.out.println();
      
    q.cEnqueue(20);
    }
}
