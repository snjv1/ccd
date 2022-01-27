package lnkedlit2;

import lnkedlit2.nNodeFromLast1.Node;

public class nNodeFromLast1 
{
    Node head; 
    
	static class Node { 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} // Constructor 
	} 

	
	public void printList() 
	{ 
		Node n = head; 
		while (n != null) { 
			System.out.print(n.data + " "); 
			n = n.next; 
		} 
	} 

       
	
	public static void main(String[] args) 
	{ 
		
		nNodeFromLast1 llist = new nNodeFromLast1(); 

		llist.head = new Node(10); 
		Node second = new Node(20); 
		Node third = new Node(30); 
                Node fourth = new Node(40); 
                Node fifth = new Node(50); 
                Node sixth = new Node(60); 

		llist.head.next = second;
		second.next = third; 
                third.next=fourth;
                fourth.next=fifth;
                fifth.next=sixth;
                
                System.out.println("starting");
                llist.printList();
                System.out.println();
                System.out.println();
                
                nNode nd =new nNode();
                
                System.out.println("last Nth node");
                nd.nNOdeFromLast(llist.head,3);
        }
                

    
}

class nNode{
 
public int nNOdeFromLast( Node head ,int n)
    {
        
         int c=0;
        if(head == null)
            System.out.println("empty list");
        
        Node temp=head;
        while(temp !=null)
        {
            c++;
            temp=temp.next;
        }
        
        if(c<n)
            return -1;
        
        temp=head;
        for(int i=0;i<c-n;i++)
            temp=temp.next;
        System.out.println(temp.data);
        
        return 0;
        
    }
}