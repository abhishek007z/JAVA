import java.util.HashMap;

class Node{
    int val;
    Node next;
    Node random;

    public Node(int val){
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
public class copyLinklist {
    public Node copyRandomList(Node head) {
        Node temp = head;

        HashMap<Node, Node> store = new HashMap<>();

        while(temp != null){
            Node newCopy = new Node(temp.val);
            store.put(temp, newCopy);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
           Node copy = store.get(temp);
           copy.next = store.get(temp.next);
           copy.random = store.get(temp.random);
           temp = temp.next;
        }
        return store.get(head);
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);

        n1.next = n2;
        n2.next = n3;

        n1.random = n3; 
        n2.random = n1; 
        n3.random = n2;

        copyLinklist obj = new copyLinklist();
        Node copiedHead = obj.copyRandomList(n1);

        System.out.println("Copied List:");
        Node temp = copiedHead;
        while(temp != null){
            int randomVal = (temp.random != null) ? temp.random.val : -1;
            System.out.println("Value: " + temp.val + ", Random: " + randomVal);
            temp = temp.next;
        }
    }
}

