package lnkedlit2;

import lnkedlit2.removeNnodeEndOflinked___EXTRA__QTN.Node;

public class removeNnodeEndOflinked___EXTRA__QTN 
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
		
		removeNnodeEndOflinked___EXTRA__QTN llist = new removeNnodeEndOflinked___EXTRA__QTN(); 

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
                llist.head=nd.nNOdeFromLast(llist.head,3);
                llist.printList();
        }
                

    
}

class nNode{
 
public Node nNOdeFromLast( Node head ,int n)
    {
        
         int c=0;
        if(head == null)
            System.out.println("empty list");
        
        Node temp=head;
        while(temp!=null)
        {
            c++;
            temp=temp.next;
        }
        
        if(c<n)
            return null;
        
        temp=head;
        Node prev=null;
        for(int i=0;i<c-n;i++)
        {
            prev=temp;
            temp=temp.next;
        }
        
        prev.next=prev.next.next;
        
        return head;
        
    }
}