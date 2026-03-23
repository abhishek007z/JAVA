package Stack;

import java.util.Stack;

public class LargestRectangle {

    public static int LargestRectangleArea(int[] heights){
        int n = heights.length;
        int[] nse = new int[n];
        int[] pse = new int[n];
        Stack<Integer> st = new Stack<>();

        // NSE
        st.push(n - 1);
        nse[n - 1] = n;

        for(int i = n - 2; i >= 0; i--){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            nse[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }

        // clear stack
        st.clear();

        // PSE
        st.push(0);
        pse[0] = -1;

        for(int i = 1; i < n; i++){
            while(!st.isEmpty() && heights[st.peek()] >= heights[i]){
                st.pop();
            }
            pse[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }

        // max area
        int max = 0;
        for(int i = 0; i < n; i++){
            int area = heights[i] * (nse[i] - pse[i] - 1);
            max = Math.max(max, area);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] heights = {2, 4, 6, 9, 1, 8, 3};
        System.out.println(LargestRectangleArea(heights));
    }
}
