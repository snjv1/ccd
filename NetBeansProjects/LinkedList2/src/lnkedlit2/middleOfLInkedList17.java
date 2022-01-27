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
public class middleOfLInkedList17 {
    
    
    
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
        
   
        /*
        FIRST APPROACH
        FIRST APPROACH
        FIRST APPROACH
        FIRST APPROACH
        */
        public void midElement(Node head)
        {
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
            }
            System.out.println(slow.data);
        }
        
        /*
        SECOND APPROACH
        SECOND APPROACH
        SECOND APPROACH
        SECOND APPROACH
        
        */
        
        public void middle(Node head)
        {
            int count=0; 
            Node temp=head;
            while(temp!=null)
            {
                count++;
                temp=temp.next;
            }
            System.out.println("count  nodes "+ count );
            
            Node Temp=head;
            for(int i=0;i<count/2;i++)
            {
               Temp=Temp.next;    
            }
            System.out.println(Temp.data);
          }

        
       
	
	public static void main(String[] args) 
	{ 
		
		middleOfLInkedList17 list = new middleOfLInkedList17(); 

		list.head = new Node(10); 
		Node second = new Node(20); 
		Node third = new Node(30); 
                Node fourth = new Node(40); 
                Node fifth = new Node(50); 
                Node six =new Node(60);
                Node seven = new Node(70);
                

		list.head.next = second;
		second.next = third; 
                third.next=fourth;
                fourth.next=fifth;
                fifth.next=six;
                six.next=seven;
                
                list.printList();
                System.out.println();
                System.out.println();
                
                System.out.println("loop");
                list.middle(list.head);
                
                System.out.println();
                System.out.println();
                
                System.out.println("turtoise method");
                list.midElement(list.head);
              
        }
}
