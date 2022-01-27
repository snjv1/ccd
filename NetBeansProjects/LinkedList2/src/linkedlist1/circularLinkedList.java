package linkedlist1;
public class circularLinkedList {
    
    Node head;
    Node tail;
    static class Node
    {
        int data;
        Node next;
        
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
    
    public void addAtBeg(int data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }
        
        else
        {
            Node temp=head;
            newNode.next=temp;
            head=newNode;
            tail.next=newNode;
            
        }
            
        
    }
    
    public void addAtEnd(int data)
    {
        Node newNode=new Node(data);
        
        if(head==null)
        {
            head=newNode;
            tail=newNode;
            newNode.next=head;
        }   
        
        else
        {
            tail.next=newNode;
            tail=newNode;
            tail.next=head;
        }
        
    }
    
    public void addAfterNode(int prevData,int newData)
    {
        Node newNode=new Node(newData);
        Node temp=head;
        
        while(temp.data!= prevData)
        {
            temp=temp.next;
        }
        
        newNode.next=temp.next;
        temp.next=newNode;
        
    }
    
    
    public void deleteAtEnd()
    {
        if(head==null)
            return;
        else
        {
            if(head!=tail)
            {
                Node temp=head;
                
                while(temp.next!=tail)
                {
                    temp=temp.next;
                }
                
                tail=temp;
                tail.next=head;
            }
            else
                head=tail=null;
        }
        
    }
    
    
    public void deleteBeg()
    {
        if(head==null) return;
        else{
            if(head!=tail){
                
                head=head.next;
                tail.next=head;
            }
            else head=tail=null;
        }
    }
    
    public void deleteKey(int data)
    {
        Node temp=head;
        Node prev=null;
         if(temp==null) System.out.println("empty list");
        
        if(temp!=null && temp.data==data)
            head=temp.next;
        while(temp!=null && temp.data!=data)
        {
            prev=temp;
            temp=temp.next;
        }   
        
        prev.next=temp.next;
        
        
       
        
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
    
    
    public static void main(String[] args) {
        
        circularLinkedList cl=new circularLinkedList();
        cl.addAtBeg(8);
        cl.addAtBeg(88);
        cl.addAfterNode(88, 10);
        cl.addAtEnd(100);
        cl.addAtEnd(852);
        cl.addAtEnd(7411);
        System.out.println("after addition");
        cl.printList();
        cl.deleteAtEnd();
        System.out.println();
        System.out.println("after delete at end");
        cl.printList();
        cl.deleteBeg();
        System.out.println();
        System.out.println("after delete from beggining");
        cl.printList();
        cl.deleteKey(100);
        cl.printList();
       
        
        
        
        
    }
    
}
        
        

        
    