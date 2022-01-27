/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lnkedlit2;
import java.util.*;
import lnkedlit2.linkedListPalinrone2.Node;

/**
 *
 * @author sanje
 */
public class linkedListPalinrone2
{
    // A simple Java program for traversal of a linked list 

	Node head; // head of list 

	/* Linked list Node. This inner class is made static so that 
	main() can access it */
	static class Node { 
		int data; 
		Node next; 
		Node(int d) 
		{ 
			data = d; 
			next = null; 
		} // Constructor 
	} 

	/* This function prints contents of linked list starting from head */
	public void printList() 
	{ 
		Node n = head; 
		while (n != null) { 
			System.out.print(n.data + " "); 
			n = n.next; 
		} 
	} 

	/* method to create a simple linked list with 3 nodes*/
	public static void main(String[] args) 
	{ 
		/* Start with the empty list. */
		linkedListPalinrone2 llist = new linkedListPalinrone2(); 

		llist.head = new Node(1); 
		Node second = new Node(2); 
		Node third = new Node(1); 

		llist.head.next = second; // Link first node with the second node 
		second.next = third; // Link second node with the third node 

		llist.printList(); 
                System.out.println();
                
                Palindrome p=new Palindrome();
                
                System.out.println(p.isPalindrome(llist.head));
                
	} 
}    



    class Palindrome  
{
    
    // Function to check if linked list is palindrome
    boolean isPalindrome(Node head) 
    {
        boolean isplain=true;
        Stack<Integer> st=new Stack<>();
        Node temp=head;
        while(temp!=null)
        {
            st.push(temp.data);
            temp=temp.next;
        }
        
       
        while(head!=null)
        {
            int i=st.pop();
            if(head.data==i)
                isplain=true;
            else 
                {isplain=false;
                break;}
            head=head.next;    
                
        }
        
     return isplain;        
    }
}


    
