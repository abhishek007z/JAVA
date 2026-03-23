class Node{
    int data;
    Node next;

    Node (int data){
        this.data = data;
        this.next = null;
    }
}
public class RotatingList {
    public static Node rotateList(Node head, int k){
        Node temp = head;
        int length = 1;
        while(temp != null){
            temp = temp.next;
            length++;
        }
        temp.next = head;
        k = k % length;

        if(k % length == 0){
            return head;
        }

        int tail = length - k;
        Node newTail = head;
        for(int i = 0; i < tail; i++){
            newTail = newTail.next;
        }

        Node newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
    
    public static void main(String[] args) {
        Node Head = new Node(1);
        Head.next = new Node(2);
        Head.next.next = new Node(3);
        Head.next.next.next = new Node(4);
        Head.next.next.next.next = new Node(5);

        int k = 2;
        Node newHead = rotateList(Head, k);
    }
}
