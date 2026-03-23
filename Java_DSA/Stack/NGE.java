package Stack;

import java.util.*;

public class NGE {
    public static int[] nextGreaterElement(int[] arr) {
        int n = arr.length;
        int[] next = new int[n];

        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            next[i] = stack.isEmpty() ? -1 : stack.peek();
            stack.push(arr[i]);
        }
        return next;
    }

    public static void main(String[] args) {
        int[] arr = {4, 5, 2, 25, 3, 9, 1, 12};
        int[] result = nextGreaterElement(arr);
        System.out.println(Arrays.toString(result));
    }
}
