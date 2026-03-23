package DoublelyLinkedList;

class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class ReverseList {
    public static Node reverse(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node current = head; 
        Node temp = null;
        
        while(current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
        return head;
    }

    public static void main(String[] args) {

        Node head = new Node(1);
        head.next = new Node(2);
        head.next.prev = head;
        head.next.next = new Node(3);
        head.next.next.prev = head.next;

        head = reverse(head);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
