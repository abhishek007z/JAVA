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

public class ConvertArrayToList {
    public static Node ConvertArray(int[] nums) {
        Node head = new Node(nums[0]);
        Node current = head;
        for (int i = 1; i < nums.length; i++) {
            Node temp = new Node(nums[i]);
            current.next = temp;
            temp.prev = current;
            current = temp;
        }
        return head;
    }

    //Delete at end
    public static Node deleteAtEnd(Node head) {
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        tail.prev.next = null;
        return head;
    }

    //Delete at starting
    public static Node deleteAtStart(Node head) {
        head = head.next;
        head.prev = null;
        return head;
    }

    //Insterting at starting
    public static Node insertAtStart(Node head, int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head.prev = newNode;
        head = newNode;
        return head;
    }

    //Inserting before the last node
    public static Node insertBeforeLast(Node head, int data) {
        Node newNode = new Node(data);
        Node tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        Node secondLast = tail.prev;
        secondLast.next = newNode;
        newNode.prev = secondLast;
        newNode.next = tail;
        tail.prev = newNode;
        return head;
    }

    //Inserting at the end
    public static Node insertAtEnd(Node head, int data){
        Node newNode = new Node(data);
        Node tail = head;
        while(tail.next != null){
            tail = tail.next;
        }
        tail.next = newNode;
        newNode.prev = tail;
        return head;
    } 

    //Deletion at the k node
    public static Node deleteAtSpecificNode(Node head, int k){
        Node temp = head;
        int count = 0;
        while(temp.next != null){
            if(count == k) break;
            temp = temp.next;
        }
        Node back = temp.prev;
        Node front = temp.prev;
        if(prev == null){
            deleteAtStart(head);
        }
        else if(front == null){
            deleteAtEnd(head);
        }
        else if(prev == null && front == null){
            return null;
        }
        else{
            back.next = front;
            front.prev = back;
            temp.prev = null;
            temp.next = null;
        }
        return head;

    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        Node head = ConvertArray(nums);
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
        
        head = deleteAtStart(head);
        head = deleteAtEnd(head);
        head = insertAtStart(head, 5);
        head = insertBeforeLast(head, 45);
        head = insertAtEnd(head, 60);

        temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
