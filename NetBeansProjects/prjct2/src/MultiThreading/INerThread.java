
package MultiThreading;

/**
 *
 * @author Sanjeev
 */
public class INerThread extends Thread {
  
    
    public void run()  
	    {    
	        System.out.println("Priority of thread is: "+Thread.currentThread().getPriority());    
	    }    
	    public static void main(String args[])  
	    {    
	        // creating one thread   
	        INerThread t1=new INerThread();   
                 INerThread t2=new INerThread();   
                  INerThread t3=new INerThread();   
                
	        // print the maximum priority of this thread  
	        t1.setPriority(Thread.MAX_PRIORITY);
                t2.setPriority(Thread.MIN_PRIORITY);
                t3.setPriority(Thread.NORM_PRIORITY);
	        // call the run() method  
	        t1.start();
                t2.start();
                t3.start();
	    }   
    
}
