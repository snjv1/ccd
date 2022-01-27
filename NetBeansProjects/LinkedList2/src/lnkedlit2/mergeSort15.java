package lnkedlit2;

import lnkedlit2.mergeSort15.Node;

public class mergeSort15 
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
            if(head==null)
                System.out.println("empty list");
            
		Node n = head; 
		while (n != null) { 
			System.out.print(n.data + " "); 
			n = n.next; 
		} 
	} 
    
    public static void main(String[] args) 
    {
        
            mergeSort15 list = new mergeSort15(); 

		list.head = new Node(10); 
		Node second = new Node(2); 
		Node third = new Node(33); 
                Node fourth = new Node(40); 
                Node fifth = new Node(15); 
                Node sixth = new Node(19); 

		list.head.next = second;
		second.next = third; 
                third.next=fourth;
                fourth.next=fifth;
                fifth.next=sixth;

		list.printList(); 
                System.out.println();
                
                System.out.println("after merge sort");
                
              
                
                System.out.println();
                System.out.println();
                
                solution SS =new solution();
                list.head=SS.sortlist(list.head);
                list.printList();;
                
    }
}





class solution
{
    public Node sortlist(Node head)
    {
        if(head==null || head.next==null)
            return head;
        
        Node temp=head;
        Node slow=head;
        Node fast=head;
        
        while(fast!=null && fast.next!=null)
        {
            temp=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        temp.next=null;
        
        Node leftSide = sortlist(head); 
        Node rightSide = sortlist(slow);
        
        return mergeSort(leftSide,rightSide);
        
    }
    
    public Node mergeSort(Node l1,Node l2)
    {
        Node sortedList = new Node(0);
        Node current = sortedList;
        
        while(l1!=null && l2!=null)
        {
            if(l1.data < l2.data)
            {
                current.next=l1;
                l1=l1.next;
            }
            else
            {
                current.next=l2;
                l2=l2.next;
            }
            
            current=current.next;
        }
        if(l1!=null)
        {
            current.next=l1;
            l1=l1.next;
        }
        
        if(l2!=null)
        {
            current.next=l2;
            l2=l2.next;
        }
        return sortedList.next;
    }

    removeDuplicatesUnsorted9.Node sortlist(removeDuplicatesUnsorted9.Node head) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
     