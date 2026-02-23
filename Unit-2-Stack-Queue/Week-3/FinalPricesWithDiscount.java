// Name: R. Lavanya
// ID: vtu26374
// Subject: 10212CS292 - Applied Programming Skills
// Unit: Unit 2
// Week: Week 3
// Problem: Final Prices With a Special Discount in a Shop
// Platform: LeetCode

import java.util.Stack;

class Solution {
    public int[] finalPrices(int[] prices) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(int i = 0; i < prices.length; i++) {
            
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                
                int index = stack.pop();
                prices[index] = prices[index] - prices[i];
            }
            
            stack.push(i);
        }
        
        return prices;
    }
}
