package Stack;

import java.util.*;

public class copyStack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Stack<Integer> st = new Stack<>();
        int n;
        System.out.print("Enter number of elements in stack: ");
        n = sc.nextInt();
        System.out.println("Enter elements of stack: ");
        for(int i = 0; i < n; i++){
            int x = sc.nextInt();
            st.push(x);
        
        }
        System.out.println(st);

        //reverse the stack
        Stack<Integer> rt = new Stack<>();
        while (st.size() > 0) {
            int x = st.peek();
            rt .push(x);
            st.pop();
        }
        System.out.println(rt);
        sc.close();
    }
}


