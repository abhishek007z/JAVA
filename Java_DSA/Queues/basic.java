package Queues;

class Node {
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class FirstQueue {
    Node front = null;
    Node rear = null;

    // Insert element
    public void add(int data){
        Node newNode = new Node(data);
        if(rear == null){
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Remove element
    public void remove(){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        System.out.println(front.data);
        front = front.next;
        if(front == null){
            rear = null;
        }
    }

    // View front element
    public void peek(){
        if(front == null){
            System.out.println("Queue is empty");
        }else{
            System.out.println(front.data);
        }
    }

    // Display queue
    public void display(){
        if(front == null){
            System.out.println("Queue is empty");
            return;
        }
        Node temp = front;
        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println("null");
    }

    // insert at end
    public void insertEnd(int data){
        Node newNode = new Node(data);

        if(rear == null){
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    // insert at starting
    public void insertStart(int data){
        Node newNode = new Node(data);

        if(front == null){
            front = rear = newNode;
            return;
        }

        newNode.next = front;
        front = newNode;
    }
}

public class basic {
    public static void main(String[] args) {
        FirstQueue q = new FirstQueue();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.display();
        q.peek();
        q.display();
        q.remove();
        q.add(50);
        q.display();
        q.insertStart(100);
        q.display();
    }
}
