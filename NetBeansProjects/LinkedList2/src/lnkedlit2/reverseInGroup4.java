package lnkedlit2;

import lnkedlit2.reverseInGroup4.Node;

public class reverseInGroup4 
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
        
            reverseInGroup4 list = new reverseInGroup4(); 

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

		list.printList(); 
                System.out.println();
                
                reverse1 rr=new reverse1();
                list.head=rr.reverse(list.head,3);
                list.printList();
                
    }
}


class reverse1
{
    Node reverse(Node head, int k)
    {
        Node current =head;
        Node prev=null;
        Node next =null;
        int count=0;
        
        while(current!=null && count<k)
        {
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
            count++;
        }
        
        if(next !=null)
            head.next=reverse(next,k);
        
        return prev;
        }
}