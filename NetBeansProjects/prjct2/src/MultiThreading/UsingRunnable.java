package MultiThreading;
public class UsingRunnable {
    
//    public static void main(String[] args) {
//        A obj =new A();
//        B ob=new B();
//        
//        Thread t1=new Thread(obj);
//        Thread t2=new Thread(ob);
//        
//        t1.start();
//        try{Thread.sleep(1000);} catch(Exception e){}
//        t2.start();
//        
//        
//}}
//
//class A implements Runnable{
//    public void run(){
//        for(int i=0;i<5;i++)
//        System.out.println("Sanjeev"); 
//        try{Thread.sleep(5000);} catch(Exception e){}
//        
//    }}
//
//class B implements Runnable{
//    public void run(){
//        for(int i=0;i<5;i++)
//        System.out.println("Soni");    
//        try{Thread.sleep(5000);} catch(Exception e){}
//    }


//by creating anonyms class

public static void main(String[] args) throws Exception{
         
        Thread t1=new Thread(() -> {
        for(int i=0;i<5;i++)
        System.out.println("Sanjeev"); 
        try{Thread.sleep(5000);} catch(Exception e){}
        });
        
        
        
        Thread t2=new Thread(() -> 
        {
        for(int i=0;i<5;i++)
        System.out.println("Soni");    
        try{Thread.sleep(5000);} catch(Exception e){}
        });
        
        System.out.println(t1.getName());                   // .getname() give the name of thread
        System.out.println(t2.getName());
        
        
        
        t1.start();                         
        try{Thread.sleep(1000);} catch(Exception e){}
        t2.start();
        
        
        t1.join();              //bye using join it means when T1 thread complete only then MAIN thread join them until it waits to complete T1 thread 
        System.out.println(t1.isAlive());                        //to check wheter thread T1 is completed or still alive 
        t2.join();              //bye using join it means when T2 thread complete only then MAIN thread join them until it waits to complete T2 thread
        System.out.println("bye");
        
        
}}


    

    

