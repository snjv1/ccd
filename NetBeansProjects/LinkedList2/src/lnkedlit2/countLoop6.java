package lnkedlit2;
public class countLoop6 
{
     
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
		Node n = head; 
		while (n != null) { 
			System.out.print(n.data + " "); 
			n = n.next; 
		} 
	} 

        public int detectLoop(Node head)
        {
            Node slow=head;
            Node fast=head;
            int flag=0;
            
            while(slow!=null && fast!=null && fast.next!=null)
            {
                slow=slow.next;
                fast=fast.next.next;
                
                if(slow==fast)
                {
                    
                    return countNodes(slow);
                    
                }
            }
            
            
                return 0;
            
        }
        public int countNodes(Node k)
        {
            int count=1;
            Node temp=k;
            
            while(temp.next!=k)
            {
                count++;
                temp=temp.next;
            }
            return count;
        }
	
	public static void main(String[] args) 
	{ 
		
		countLoop6 llist = new countLoop6(); 

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
                
                
                /*
                creating a loop to check function of loop
                */
                sixth.next=fourth;
                
                /*
                if there is loop print then count length of loop 
                
                else 
                print 0
                */
                System.out.println(llist.detectLoop(llist.head));
                
        }

    
}
