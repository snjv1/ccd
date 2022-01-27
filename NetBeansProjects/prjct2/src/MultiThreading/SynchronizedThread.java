package MultiThreading;
public class SynchronizedThread {
    public static void main(String[] args) throws Exception {
        
        
        Counter c=new Counter();
        Thread t1=new Thread(() ->
            {
                for(int i=1;i<=1000;i++)
                {
                    c.increment();
                }
            }
        );
        
        Thread t2=new Thread(() ->
            {
                for(int i=1;i<=1000;i++)
                {
                    c.increment();
                }
            }
        );
        
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("count"+c.count);
    
    }  
}

class Counter{
    int count;
    public synchronized void increment()      //by using synchronized it give acess only one thread at a time
    {
        count++;
    }
}
