package linkedlist1;
public class doublyCircularLinkedList {
    Node head;
    static class Node{
        int data;
        Node prev;
        Node next;
        
        Node(int data)
        {
           this.data=data;
            prev=null;
            next=null;
        }
    }
    
    
    public void addBeg(int data)
    {
        Node newNode =new Node(data);
        if(head==null)
        {head=newNode;
        newNode.next=head;
         newNode.prev=head;
        return;}
        
        else
        {
            
            newNode.next=head;
            newNode.prev=head.prev;
            newNode.prev.next=newNode;
            head.prev=newNode;
            head=newNode;
                
        }
    }
    
    public void addEnd(int data){
        
        Node newNode=new Node(data);
        if(head==null) 
        {
            head=newNode;
            newNode.next=head;
            newNode.prev=head;
            return;
        }
        
        else{
            Node temp=head;
            while(temp.next!=head)
            {
                temp=temp.next;
            }
             temp.next=newNode;
            newNode.next=head;
            newNode.prev=temp;
            head.prev=newNode;
           
        }
    }
    
    
    public void addAfterKey(int prevData,int data)
    {
        Node newNode =new Node(data);
        Node temp=head;
        
        while(temp.data!=prevData)
        {
            temp=temp.next;
        }
        
        newNode.next=temp.next;
        newNode.prev=temp;
        temp.next=newNode;
        newNode.next.prev=newNode;
        
    }
    
    public void deleteBeg()
    {
        if(head==null) System.out.println("empty list");
        
        else
        {
            head.next.prev=head.prev;
            head=head.next;
        }
    }
    
    public void deleteEnd()
    {
        if(head==null) System.out.println("empty list");
        
        Node temp=head;
        while(temp.next!=head)
        {
            temp=temp.next;
        }
        
        temp.prev.next=head;
        head.prev=temp.prev;
    }
    
    public void deleteKey(int data )
    {
        
        
        Node temp=head;
        while(temp.data!=data)
        {
            temp=temp.next;
        }
        temp.next.prev=temp.prev;
        temp.prev.next=temp.next;
    }
    
    
    
    
    
    public void printList()
    {
        Node temp=head;
        if(head==null)
            System.out.println("empty list");
        else{ 
        while(temp.next!=head){
            System.out.println(temp.data);
            temp=temp.next;
        }
            System.out.println(temp.data);
        }
    }
    
    public static void main(String[] args) {
        doublyCircularLinkedList dcll=new doublyCircularLinkedList();
        dcll.addBeg(10);
        dcll.addBeg(50);
        dcll.addEnd(200);
        dcll.addAfterKey(50,55);
        dcll.addEnd(1010);
        dcll.printList();
        System.out.println();
        dcll.deleteKey(200);
        System.out.println("after delete key");
        dcll.printList();
    }
}
