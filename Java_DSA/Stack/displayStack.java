package Stack;

import java.util.Stack;

public class displayStack {
    public static void displayRec(Stack<Integer> st){
        if(st.size() == 0) return;
        int top = st.pop();
        displayRec(st); 
        System.out.print(top + " ");
        st.push(top);   
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        displayRec(st);
    }
}
