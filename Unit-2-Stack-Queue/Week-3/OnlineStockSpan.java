// Name: R. Lavanya
// ID: vtu26374
// Subject: 10212CS292 - Applied Programming Skills
// Unit: Unit 2
// Week: Week 3
// Problem: Online Stock Span
// Platform: LeetCode


import java.util.Stack;
class StockSpanner {
    private Stack<int[]> stack;
    public StockSpanner() {
        stack = new Stack<>();
    }
    public int next(int price) {
        int span = 1;

        while (!stack.isEmpty() && stack.peek()[0] <= price) {
            span += stack.pop()[1];
        }
        stack.push(new int[]{price, span});

        return span;
    }
}

