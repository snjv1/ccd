package lnkedlit2;

import lnkedlit2.lastToFirsst10.Node;

public class lastToFirsst10 
{
    Node head;
    
    static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
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
        
          lastToFirsst10  list = new lastToFirsst10(); 
               
		list.head = new Node(10); 
		Node second = new Node(40); 
		Node third = new Node(30); 
                Node fourth = new Node(60); 
                Node fifth = new Node(50); 
                Node sixth = new Node(90); 
                Node seventh = new Node(1);

		list.head.next = second;
		second.next = third; 
                third.next=fourth;
                fourth.next=fifth;
                fifth.next=sixth;
                sixth.next=seventh;
                
                
                System.out.println("before");
                list.printList();
                
                System.out.println();
                
                first fs = new first();
                list.head=fs.firstToLast(list.head);
                System.out.println();
                System.out.println("after");
                list.printList();
                
            

		
                
    }
    
}


class first
{
    public Node firstToLast(Node head)
    {
        
        
        Node temp =head;
        Node prev=null;
        
        while(temp.next!=null)
        {
            prev=temp;
            temp=temp.next;
        }
        prev.next=null;
        temp.next=head;
        head=temp;
        
      return head;  
    }
}
