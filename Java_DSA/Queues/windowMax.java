package Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Arrays;

public class windowMax {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n-k+1];
        int index = 0;
        Deque<Integer> dq = new ArrayDeque<>();
        for(int i = 0; i < n; i++){
            if(!dq.isEmpty() && dq.peekFirst() <= i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[dq.peekLast()] < nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            //when the window size is 1, then this condition will fail and to overcome this we use this condition.
            if(i >= k - 1){//only works on the window size 1.
                ans[index++] = nums[dq.peekFirst()];
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        windowMax obj = new windowMax();
        int[] result = obj.maxSlidingWindow(nums, k);

        System.out.println(Arrays.toString(result));
    }
}
