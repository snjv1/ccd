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
public class checkCircularList18And22 {
    
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
        Node temp=head;
        if(head==null)
          System.out.println("list is empty");            
        
        else {  
            System.out.println("Nodes of the circular linked list: ");  
           
            do{
                System.out.println(" " + temp.data);
                temp=temp.next;
            }while(temp!=head);
        }  
    } 
        
        public void circular(Node head)
        {
            Node temp=head.next;
            while(temp.next!=null && temp.next!=head)
            {
                temp=temp.next;
            }
            if(temp.next==head)
            System.out.println("circular");
            else 
                System.out.println("not a ciular linked list");
            
            
        }
        
        public Node firstToLast(Node head)
        {
            Node temp=head;
            
            while(temp.next!=head)
            {
                temp=temp.next;
            }
            Node exchng= new Node(temp.data);
            temp.data=head.data;
            head.data=exchng.data;
            
            return head;
        }
                

       
	
	public static void main(String[] args) 
	{ 
		
		checkCircularList18And22 list = new checkCircularList18And22(); 

		list.head = new Node(10); 
		Node second = new Node(20); 
		Node third = new Node(30); 
                Node fourth = new Node(40); 
                Node fifth = new Node(50); 
                Node sixth = new Node(60); 

		list.head.next = second;
		second.next = third; 
                third.next=fourth;
                fourth.next=fifth;
                fifth.next=sixth;
                sixth.next=list.head;
                
                
                list.printList();
                System.out.println();
                System.out.println();
                
               // list.circular(list.head);
                
               list.head=list.firstToLast(list.head);
               System.out.println("first to last ");
               list.printList();
         
             
        }
    
    
}
