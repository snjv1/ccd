package linkedlist1;
public class doublyLinkedList {
 
    Node head;
static class Node{
    int data;
    Node prev;
    Node next;
    
     Node(int data){
         this.data=data;
         prev=null;
         next=null;         
     }
}    

public void addAtBeg(int data){
    Node newNode =new Node(data);
    
    if(head==null){
        head=newNode;
        return;
    }
    else{
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
}


public void addAtEnd(int data){
    Node newNode=new Node(data);
    Node temp=head;
    if(head==null){
        head=newNode;
        return;
    }
    
    else{
        
        while(temp.next!=null){
            temp=temp.next;
        }
        
        temp.next=newNode;
        newNode.prev=temp;
        
    }
}

public void addAfter(int prevData ,int newData){
    Node newNode=new Node(newData);
    Node temp=head;
    
    while(temp.data!=prevData){
        temp=temp.next;
    }
    newNode.prev=temp;
    newNode.next=temp.next;
    temp.next=newNode;
    newNode.next.prev=newNode;
    
}

public void deleteBeg(){
    if(head==null)   System.out.println("list is empty");
     
    else{
        
        head=head.next;
        head.prev=null;
    }
    
}

public void deleteEnd()
{
    if(head==null)
        System.out.println("empty list");
    
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }
    temp.prev.next=null;
    
}

public void deleteKey(int data)
{
    Node temp=head;
    
    while(temp.data!=data){
        temp=temp.next;
    }
    temp.next.prev=temp.prev;
    temp.prev.next=temp.next;
    
    
}



public void printList(){
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
    
}

    public static void main(String[] args) {
        doublyLinkedList dll=new doublyLinkedList();
       dll.addAtBeg(5);
        dll.addAtEnd(88);
        dll.addAtBeg(7878);
        dll.addAtBeg(2);
        dll.addAtEnd(1010);
        dll.addAtEnd(105020);
        System.out.println("after updating");
        dll.printList();
        System.out.println();
        dll.addAfter(88,90);
        System.out.println("add after");
        dll.printList();
        dll.deleteBeg();
        System.out.println();
        System.out.println("delete beg");
        dll.printList();
        System.out.println();
        System.out.println("delete 90");
        dll.deleteKey(90);
        dll.printList();
    }
}



