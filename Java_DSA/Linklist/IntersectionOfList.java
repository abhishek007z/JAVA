class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class IntersectionOfList {

    // make method static
    public static Node getIntersectionNode(Node headA, Node headB) {
        Node fast = headA;
        Node slow = headB;
        int lengthA = 0;
        while (fast != null) {
            lengthA++;
            fast = fast.next;
        }
        int lengthB = 0;
        while (slow != null) {
            lengthB++;
            slow = slow.next;
        }
        fast = headA;
        slow = headB;
        if (lengthA > lengthB) {
            int steps = lengthA - lengthB;
            for (int i = 0; i < steps; i++) {
                fast = fast.next;
            }
        } else {
            int steps = lengthB - lengthA;
            for (int i = 0; i < steps; i++) {
                slow = slow.next;
            }
        }
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }
        return fast;
    }

    public static void main(String[] args) {
        // intersection part
        Node intersect = new Node(8);
        intersect.next = new Node(10);

        // List A: 1 → 2 → 3 → 8 → 10
        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = new Node(3);
        headA.next.next.next = intersect;

        // List B: 4 → 5 → 8 → 10
        Node headB = new Node(4);
        headB.next = new Node(5);
        headB.next.next = intersect;

        Node result = getIntersectionNode(headA, headB);

        if (result != null) {
            System.out.println("Intersection Node Value: " + result.data);
        } else {
            System.out.println("No Intersection Found");
        }
    }
}
