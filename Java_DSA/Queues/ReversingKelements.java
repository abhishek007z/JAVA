package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReversingKelements {
    public static Queue<Integer> Reverse(Queue<Integer> q, int k){
        if(q == null || k > q.size() || k <= 0){
            return q;
        }

        Stack<Integer> st = new Stack<>();
        //adding the elements in the stack
        for(int i = 0; i < k; i++){
            st.push(q.remove());
        }
        //adding the elements back to queue
        while(!st.isEmpty()){
            q.add(st.pop());

        }
        for(int i = 0; i < q.size() - k; i++){
            q.add(q.remove());
        }
        return q;
    }

    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        
        int k = 2;

        System.out.println(q);
        Reverse(q,k);
        System.out.println(q);
    }
}
