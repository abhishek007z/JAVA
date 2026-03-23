class Node{ //user define data type
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

class Linkedlist{ //user define data structure
    Node head;
    Node tail;
    int size;
    int search(int val){
        if(head == null) return -1;
        Node temp = head;
        int index = 0;
        while(temp != null){
            if(temp.val == val) return index;
            temp = temp.next;
        }
        return -1;
    }

    int get(int index){
        Node temp = head;
        for(int i = 1; i < index; i++){
            temp = temp.next;
        }
        return temp.val; 
    }

    void addAtTail(int val){
        Node temp = new Node(val);
        if(tail == null){
            head = tail = temp;
        }
        else{
            tail.next = temp;
            tail = temp;
        }
        size++;
    }

    void displayList(){
        if(head == null) return;
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void addAtHead(int val){
        Node temp = new Node(val);
        if(head == null){
            head = tail = temp;
        }
        else{
            temp.next = head;
            head = temp;
        }
        size++;
    }

    void deleteAtHead(){
        if(head == null) {
            System.out.println("list is empty");
            return;
        }
        head = head.next;
        if(head == null) tail = null;
        size--;
    }

    void insertAtIndex(int val, int index){
        if(index < 0 || index > size){
            System.out.println("Invalid index");
            return;
        }
        if(index == 0) addAtHead(val);
        else if( index == size) addAtTail(val);
        else{
            Node temp = head;
            for(int i = 1; i < index-1; i++){
                temp = temp.next;
            }
            Node newNode = new Node(val);
            newNode.next = temp.next;
            temp.next = newNode;
            size++;
        }
    }

    void deleteAtIndex(int index){
        if(index < 0 || index >= size){
            System.out.println("Invalid index");
            return;
        }
        if(index == 0){
            deleteAtHead();
            return;
        }
        Node temp = head;
        for(int i = 1; i < index-1; i++){
            temp = temp.next;
        } 
        temp.next = temp.next.next; // deleted the connection from the index node
        if(index == size-1) tail = temp; // to delete the tail node
        size--;
    }
}

public class Implementation {
    public static void main(String[] args) {
        Linkedlist list = new Linkedlist();
        list.addAtTail(10); 
        list.addAtTail(20); 
        list.addAtTail(30); 
        list.addAtTail(40); 
        list.addAtTail(50); 
        list.addAtTail(80); 
        list.addAtTail(90); 
        list.displayList();
        list.addAtHead(60);
        list.displayList();
        list.deleteAtHead();
        list.displayList();
        System.out.println(list.size);
        list.insertAtIndex(70,3);
        list.displayList();
        System.out.println(list.get(4));
        list.deleteAtIndex(7);
        list.displayList();
    }
}
