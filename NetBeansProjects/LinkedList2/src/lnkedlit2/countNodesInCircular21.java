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
public class countNodesInCircular21 {
    
    
    
    
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

	public void pprintList()
    
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
    
        
       public void count(Node head)
        {
            if(head==null)
                System.out.println("empty");
            int count=1; 
            Node temp=head;
            while(temp.next!=head)
            {
                count++;
                temp=temp.next;
            }
            System.out.println("count  nodes "+ count );
            
          }

       
	
	public static void main(String[] args) 
	{ 
		
		countNodesInCircular21 list = new countNodesInCircular21(); 

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
                
                list.count(list.head);
        }
                
}
