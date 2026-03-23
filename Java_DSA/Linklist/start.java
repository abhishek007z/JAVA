// class Node {
//     int data;
//     Node next;

//     Node(int data1) {
//         this.data = data1;
//         this.next = null;
//     }
// }

// public class Start {
//     public static void traverse(Node head) {
//         Node temp = head;

//         while (temp != null) {
//             System.out.print(temp.data + " -> ");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }

//     public static void main(String[] args) {

//         Node Obj1 = new Node(4);
//         Node Obj2 = new Node(7);
//         Node Obj3 = new Node(8);
//         Node Obj4 = new Node(3);

//         Obj1.next = Obj2;
//         Obj2.next = Obj3;
//         Obj3.next = Obj4;

//         traverse(Obj1);
//     }
// }


class Node{ //user define data type
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

class LinkList{
    Node head;
    Node tail;

    void addToTail(int val){
        Node newNode = new Node(val);
        if(tail == null){
            tail = head = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
    }

    void display(){
        if(head == null) return;
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void addToHead(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = tail = newNode;
        }
        else{
            newNode.next = head;
            head = newNode;
        }
    }

    void deleteFromHead(int val){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }
}

public class Start{
    public static void main(String[] args) {
        LinkList list = new LinkList();
        list.addToTail(10);
        list.addToTail(20);
        list.addToTail(30);
        list.addToTail(40);
        list.addToTail(50);
        list.display();
        list.addToHead(100);
        list.display();
        list.addToHead(400);
        list.display();
        list.deleteFromHead(400);
        list.display();
    }
}