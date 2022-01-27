package lnkedlit2;

import java.util.HashSet;
import lnkedlit2.removeDuplicatesUnsorted9.Node;

public class removeDuplicatesUnsorted9 
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
        
            removeDuplicatesUnsorted9 list = new removeDuplicatesUnsorted9(); 
            

		list.head = new Node(10); 
		Node second = new Node(12); 
		Node third = new Node(11); 
                Node fourth = new Node(11); 
                Node fifth = new Node(12); 
                Node sixth = new Node(11);
                Node seventh = new Node(10);        ; 

		list.head.next = second;
		second.next = third; 
                third.next=fourth;
                fourth.next=fifth;
                fifth.next=sixth;
                sixth.next=seventh;
                
                remove rp=new remove();
                list.head=rp.duplicates(list.head);
         
                
                System.out.println("afterr removing duplicates linked list is");
                list.printList();
    }
    
}


/*
using hash set
*/

class remove
{
    public Node duplicates(Node root)
    {
        Node temp=root;
        Node prev=null;
        HashSet<Integer> hs =new HashSet<>();

        while(temp!=null)
        {
            int i=temp.data;
            if(hs.contains(i))
            {
                prev.next=temp.next;
                
            }
            else
            {
                hs.add(i);
                prev=temp;
            }
            
             temp=temp.next;
        }
       
    
    return root;
    }
}