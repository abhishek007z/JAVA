class Node{
    int data;
    Node next;

    Node(int data){
        this.data=data;
        this.next=null;
    }
}
public class ConertingArray {
    public static Node ConvertArrar(int[] nums){
        Node head = new Node(nums[0]);
        Node current = head;
        for(int i=1;i<nums.length;i++){ 
            current.next = new Node(nums[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        int[] nums = {10, 20, 30, 40, 50};
        Node head = ConvertArrar (nums);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}

