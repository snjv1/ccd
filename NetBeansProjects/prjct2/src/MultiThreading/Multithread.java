package MultiThreading;
public class Multithread {
    public static void main(String[] args) {
        A obj =new A();
        B ob=new B();
        obj.start();
        try{Thread.sleep(1000);} catch(Exception e){}
        ob.start();
        
        
}}

class A extends Thread {
    public void run(){
        for(int i=0;i<5;i++)
        System.out.println("Sanjeev"); 
        try{Thread.sleep(5000);} catch(Exception e){}
        
    }}

class B extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
        System.out.println("Soni");    
        try{Thread.sleep(5000);} catch(Exception e){}
    }}

