class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

public class Basic {
    public static void reverseList(Node head){
        if(head == null) return;
        reverseList(head.next);
        System.out.print(head.val+" ");
    }

    public static void displayRec(Node head){
        if(head == null) return;
        System.out.print(head.val+" ");
        displayRec(head.next);
    }

    public static void display(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        display(a);
        // displayRec(a);
        reverseList(a);
    }
}
