class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class cycleStart {
    public static Node cycle(Node head){
        if(head == null || head.next == null) return null;
        Node fast = head;
        Node slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow) break;
        }
        if(fast == null || fast.next == null) return null;
        Node temp = head;
        while(temp != slow){
            slow = slow.next;
            temp = temp.next;
        }
        return slow;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        head.next.next.next.next.next = head.next.next;

        Node start = cycle(head);
        if (start != null) {
            System.out.println("Cycle starts at node: " + start.data);
        } else {
            System.out.println("No cycle present");
        }
    }
}
