package Stack;

import java.util.*;

public class StockSpan {
    Stack<int[]> stack;
    public StockSpan() {
        stack = new Stack<>();
    }

    public int next(int price){
        int span = 1;
        while(!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        stack.push(new int[]{price, span});
        return span;
    }

    public static void main(String[] args) {
        StockSpan obj = new StockSpan();
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        for(int p : price) {
            System.out.print(obj.next(p)+" ");
        }
    }
}
