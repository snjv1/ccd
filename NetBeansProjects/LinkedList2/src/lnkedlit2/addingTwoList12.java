package lnkedlit2;
public class addingTwoList12 
{
 
     Node head;

    static class Node {

        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void printList() {
        Node n = head;
        if (head == null) {
            System.out.println("empty list");
        }
        while (n != null) {
            System.out.print(n.data + " ");
            n = n.next;
        }

    }

    static Node addOne(Node first,Node second) {
        // reverse node
        first = reverse(first);
        second = reverse(second);
        

        // addition of none 
       Node abc= addingOne(first,second);

        //again reverse node
        return reverse(abc);
    }

    static Node reverse(Node head) {
        Node current = head;
        Node prev = null;
        Node next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;

        }

        return prev;
    }

    static Node addingOne(Node l1,Node l2)
    {
        
        Node dummy = new Node(0);
        Node temp=dummy;
        int carry =0,sum;
        while(l1!=null || l2!=null || carry==1)
        {
            
            
            sum= carry + (l1!=null ? l1.data : 0) + ( l2!=null ? l2.data :0 );
            
            if(l1!=null || l2!=null)
            {
            l1=l1.next;
            l2=l2.next;
            }
            carry= (sum>=10)? 1:0 ;
            sum=sum%10;
            
            
            Node ab= new Node(sum);
            temp.next=ab;
            temp=temp.next;
           
        }
        return dummy.next;
    }

    public static void main(String[] args)
    {
        addingTwoList12 list1 = new addingTwoList12();
        addingTwoList12 list2 = new addingTwoList12();
        addingTwoList12 list3 = new addingTwoList12();
        
        System.out.println("list one");
        list1.head = new Node(9);
        Node second = new Node(9);
        Node third = new Node(9);
        Node fourth = new Node(9);

        list1.head.next = second;
        second.next = third;
        third.next = fourth;
        
        System.out.println("list two");
        list2.head = new Node(9);
        Node secon = new Node(9);
        Node thir = new Node(9);
        Node fourt = new Node(9);

        list2.head.next = secon;
        secon.next = thir;
        thir.next = fourt;
        
        System.out.println("list one is");
        list1.printList();
        
        System.out.println();
        System.out.println();
        
        System.out.println("list second is");
        list2.printList();
        
        System.out.println();
        System.out.println();
        
        list3.head=addOne(list1.head,list2.head);
        list3.printList();
      
        
        /*
        https://youtu.be/LBVsXSMOIk4
        https://youtu.be/LBVsXSMOIk4
        https://youtu.be/LBVsXSMOIk4
        https://youtu.be/LBVsXSMOIk4
        https://youtu.be/LBVsXSMOIk4
        */
    }
    
}
