package Stack;

import java.util.*;

public class CircularNGE2 {
    public static int[] nextGreaterElements(int[] nums) {

        int n = nums.length;
        int[] next = new int[n];
        Arrays.fill(next, -1);

        Stack<Integer> stack = new Stack<>();
        for (int i = 2 * n - 1; i >= 0; i--) {

            int index = i % n;
            while (!stack.isEmpty() && stack.peek() <= nums[index]) {
                stack.pop();
            }
            if (i < n) {
                next[index] = stack.isEmpty() ? -1 : stack.peek();
            }
            stack.push(nums[index]);
        }
        return next;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 6, 19, 8};
        int[] result = nextGreaterElements(nums);
        System.out.println(Arrays.toString(result));
    }
}
