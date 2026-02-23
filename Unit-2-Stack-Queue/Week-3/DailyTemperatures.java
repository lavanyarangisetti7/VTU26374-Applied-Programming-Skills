// Name: R. Lavanya
// ID: vtu26374
// Subject: 10212CS292 - Applied Programming Skills
// Unit: Unit 2
// Week: Week 3
// Problem: Daily Temperatures
// Platform: LeetCode

import java.util.Stack;

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        
        int n = temperatures.length;
        int[] result = new int[n];
        
        Stack<Integer> stack = new Stack<>();  
        
        for (int i = 0; i < n; i++) {
            
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                
                int index = stack.pop();
                result[index] = i - index;
            }
            
            stack.push(i);
        }
        
        return result;
    }
}
