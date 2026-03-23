package Queues;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReorderingQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);
        q.add(50);
        q.add(60);
        q.add(70);
        q.add(80);
        q.add(90);
        q.add(100);
        System.out.println(q);

        
        Stack<Integer> st = new Stack<>();
        int n = q.size();
        for(int i = 1; i <= n/2; i++){
            st.push(q.remove());
        }
        while(st.size() > 0){
            q.add(st.pop());
        }
        for(int i = 1; i <= n/2; i++){
            st.push(q.remove());
        }
        while(st.size() > 0){
            //adding one by one elements to queue, first pop from stack then from queue
            q.add(st.pop());
            q.add(q.remove());
        }
        while(q.size() > 0){
            st.push(q.remove());
        }
        while(st.size() > 0){
            q.add(st.pop());
        }
        System.out.println(q);
    }
}
