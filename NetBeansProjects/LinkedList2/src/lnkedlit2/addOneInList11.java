/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lnkedlit2;

import lnkedlit2.addOneInList11.Node;

/**
 *
 * @author sanje
 */
public class addOneInList11 {

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

    static Node addOne(Node head) {
        // reverse node
        head = reverse(head);

        // adding one in node
        head = addingOne(head);

        //again reverse node
        return reverse(head);
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

    static Node addingOne(Node head) {
        Node result = head;
        Node temp = null;
        int carry = 1, sum;   // carry intiaaly is 1 bcz we have to add 1 

        while (head != null) {
            sum = carry + head.data;

            carry = (sum >= 10) ? 1 : 0;

            sum = sum % 10;

            head.data = sum;

            temp = head;
            head = head.next;
        }

        if (carry > 0) {
            temp.next = new Node(carry);
        }

        return result;

    }

    /*
       https://www.geeksforgeeks.org/add-1-number-represented-linked-list/
       https://www.geeksforgeeks.org/add-1-number-represented-linked-list/
       https://www.geeksforgeeks.org/add-1-number-represented-linked-list/
       https://www.geeksforgeeks.org/add-1-number-represented-linked-list/
       https://www.geeksforgeeks.org/add-1-number-represented-linked-list/
       https://www.geeksforgeeks.org/add-1-number-represented-linked-list/
       
       
     */
    public static void main(String[] args) {
        addOneInList11 list = new addOneInList11();
        list.head = new Node(4);
        Node second = new Node(5);
        Node third = new Node(6);
        Node fourth = new Node(7);

        list.head.next = second;
        second.next = third;
        third.next = fourth;
        System.out.println(" before adding list is ");
        list.printList();

        System.out.println();
        System.out.println();

        System.out.println(" after adding one list is");
        list.head = addOne(list.head);

        list.printList();

    }
}
