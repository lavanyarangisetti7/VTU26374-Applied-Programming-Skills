// Name: R. Lavanya
// ID: vtu26374
// Subject: 10212CS292 - Applied Programming Skills
// Unit: Unit 2
// Week: Week 3
// Problem: Minimum Remove to Make Valid Parentheses
// Platform: LeetCode

class Solution {
    public String minRemoveToMakeValid(String s) {       
        Stack<Integer> stack = new Stack<>();
        Set<Integer> remove = new HashSet<>();
        for(int i = 0; i < s.length(); i++){  
            char ch = s.charAt(i); 
            if(ch == '('){
                stack.push(i);  
            }
            else if(ch == ')'){
                if(!stack.isEmpty()){
                    stack.pop();  
                } else {
                    remove.add(i);  
                }
            }
        }
        while(!stack.isEmpty()){
            remove.add(stack.pop());
        }
        StringBuilder result = new StringBuilder();
        
        for(int i = 0; i < s.length(); i++){
            if(!remove.contains(i)){
                result.append(s.charAt(i));
            }
        }
        
        return result.toString();
    }
}
