/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lnkedlit2;

/**
 *
 * @author sanje
 */
public class deleteList7 {
    
    
    

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
            if(head==null)
                System.out.println("empty list");
            
		Node n = head; 
		while (n != null) { 
			System.out.print(n.data + " "); 
			n = n.next; 
		} 
	} 
        public void deleteList()
        {
            head=null;
        }

        
	
	public static void main(String[] args) 
	{ 
		
		deleteList7 llist = new deleteList7(); 

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

               llist.deleteList();
               llist.printList();
                
                
               
                
                
                
                
	} 
    
}
