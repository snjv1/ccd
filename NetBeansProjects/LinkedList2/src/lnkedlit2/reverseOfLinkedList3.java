package lnkedlit2;

import lnkedlit2.reverseOfLinkedList3.Node;



public class reverseOfLinkedList3 
{
    

	Node head; // head of list 

	 
	
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
		
		reverseOfLinkedList3 llist = new reverseOfLinkedList3(); 

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

		llist.printList(); 
                System.out.println();

                 
                System.out.println();
                reverse2 r2=new reverse2();
                System.out.println("reverse by recursive method");
                r2.reverse(llist.head);
                
                  reverse1 r1=new reverse1();
                llist.head=r1.reverse(llist.head);
                System.out.println();
                System.out.println();
                System.out.println("reverse iterative method");
                llist.printList();
             
               
                
                
               
                
                
                
                
	} 
}

/*
recursive function 

https://www.geeksforgeeks.org/reverse-a-linked-list/


*/

/*

https://www.geeksforgeeks.org/reverse-a-linked-list/

recursive function 
and 
iterative function also

TIME COMPLEXITY
TIME COMPLEXITY
TIME COMPLEXITY
TIME COMPLEXITY

O(n)
*/


class reverse1
{
    Node reverse(Node head)
    {
        Node current =head;
        Node prev=null;
        Node next =null;
        
        
        while(current!=null)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            
        }
    
        return prev;
        }
}

class reverse2 
{
    public void reverse(Node head)
    {
        if(head==null)
            return;
        
        reverse(head.next);
        System.out.print(head.data + " ");
    }

}
