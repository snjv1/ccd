package linkedlist1;

import java.util.*;

public class linkedList {
    Node head;
    
    static  class Node
    {
        int data;
        Node next;
        
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    
    public int addAtBeg(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {       head=newNode;
                
        }
    
        
        newNode.next=head;
        head=newNode;
        return 0;
    }
    
    public void addAtEnd(int data)
    {
        Node newNode =new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
         temp.next=newNode;
        
    }
    
    
    
    public void addAfter(int preData, int newData) 
    { 
        Node newNode =new Node(newData);
        Node temp=head;
        while(temp.data != preData)
        {
            temp=temp.next;
        }
         newNode.next=temp.next;
         temp.next=newNode;
     
    } 
    
    public void search(int data)
    {
       Node temp=head;
       while(temp !=null)
       {
           if(temp.data== data)
               System.out.println("yes");
           temp=temp.next;
       }
        System.out.println("no");
    }
    
    public void length()
    {
        int c=0;
        if(head == null)
            System.out.println("not possible");
        
        Node temp=head;
        while(temp !=null)
        {
            c++;
            temp=temp.next;
        }
        System.out.println("Length of Linked List " + c );
    }
    
    
    
   
    public void deleteList()
    {
        head=null;
    }
    public void deleteKey(int data)
    {
        Node temp=head;
        Node prev=null;
        
        if(temp!=null && temp.data==data)
            head=temp.next;
        
        while(temp!=null && temp.data!=data)
        {
            prev=temp;
            temp=temp.next;
        }
        if(temp==null)
            System.out.println(" not present");
        
        prev.next=temp.next;
        
        
    }
    
    public void deleteLast()
    {
        if(head==null)
            return;
        Node temp =head;
        Node prev =null;
        while(temp.next!=null)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
    }
 
    public void deleteBeg()
    {
        if(head ==null)
            return;
        Node temp=head;
        head=head.next;
    }
    
    public void printList()
    {
        Node temp=head;
        while( temp !=null)
        {
            System.out.println(temp.data);
            temp=temp.next;
        }
        
    }
    
    public void nNode(int index)
    {
        int count=0;
        Node temp=head;
        while(temp!=null)
        {
            if(count == index)
            {
                System.out.println(temp.data);
            }
            count++;
            temp=temp.next;
        }
    }
    
    
    /*
    count repetition of any no
    */
    public void countIntData(int no)
    {
        int count=0;
        
        Node temp=head;
        while(temp !=null)
        {
            if(temp.data == no)
                count++;
            temp=temp.next;
        }
        System.out.println(count);
            
    }
    
    
    
    public void smallestNO()
    {
        // Declare a min variable and initialize 
        // it with INT_MAX value. 
        // INT_MAX is integer type and its value 
        // is 32767 or greater. 
        int min= Integer.MAX_VALUE;
        
        Node temp=head;
        while(temp!=null)
        {
            
        // If min is greater then temp.data then 
        // assign value of temp.data to min 
        // otherwise node point to next node. 
            
            if(min>temp.data)
                min=temp.data;
            temp=temp.next;
        }
        System.out.println(min);
    }
    
    public void largestNO()
    {
        int max =Integer.MIN_VALUE;
        
        Node temp=head;
        while(temp!=null)
        {
            if(max<temp.data)
                max=temp.data;
            temp=temp.next;             
        }
        System.out.println(max);
            
    }
    
    
    
    
    
    public static void main(String[] args) {
        
        linkedList ll=new linkedList();
        ll.addAtEnd(1);
        ll.addAtEnd(34);
        ll.addAtEnd(32);
        ll.addAtBeg(-3);
        ll.addAtBeg(-33);
        ll.addAtEnd(12);
        ll.addAtEnd(300);
        ll.addAtEnd(500);
        ll.addAtEnd(800);
        ll.addAtBeg(12);
        ll.addAtEnd(32);
        ll.addAtBeg(32);
        ll.addAfter(-3,32);
        ll.addAtEnd(32);
        ll.addAtEnd(5000);
        ll.addAfter(12,6565);
        
        ll.printList();
        
        
        
         
       
    }
    

}