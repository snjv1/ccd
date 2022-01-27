package lnkedlit2;

import lnkedlit2.removeDUplicteSorted8.Node;

public class removeDUplicteSorted8 
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
        
            removeDUplicteSorted8 list = new removeDUplicteSorted8(); 
            removeDUplicteSorted8 list2 = new removeDUplicteSorted8(); 
             

		list.head = new Node(10); 
		Node second = new Node(11); 
		Node third = new Node(11); 
                Node fourth = new Node(11); 
                Node fifth = new Node(12); 
                Node sixth = new Node(13);
                Node seventh = new Node(13);        ; 

		list.head.next = second;
		second.next = third; 
                third.next=fourth;
                fourth.next=fifth;
                fifth.next=sixth;
                sixth.next=seventh;
                
                duplicates  dp= new duplicates();
                list.head=dp.removeDupli(list.head);
                System.out.println();
                System.out.println("first");
                list.printList();
                
                System.out.println();
                System.out.println();
                
                duplicate2 dpp = new duplicate2();
                list2.head=dpp.removeDuplic(list.head);
                System.out.println("second");
                list2.printList();
                
                
                
    }
}
                
class duplicates
{
    public Node removeDupli(Node head)
    {
        Node current =head;
        
        while(current!=null)
        {
            Node temp=current;  /* important     https://www.geeksforgeeks.org/remove-duplicates-from-a-sorted-linked-list/*/
            while(temp!=null && temp.data==current.data)
            {
                temp=temp.next;
            }
            current.next=temp;
            current=temp;
        }
        return head;
    }
}

class duplicate2
{
    Node removeDuplic(Node root)
    {
        Node first=root;
        Node second= first.next;
        
        while(second!=null)
        {
            if(first.data==second.data)
            {
                first.next=second.next;
            }
            else
            {
                first=first.next;
            }
            
            second=second.next;
        }
     return root;   
    }
}
