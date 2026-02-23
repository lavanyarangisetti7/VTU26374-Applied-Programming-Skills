// Name: R. Lavanya
// ID: vtu26374
// Subject: 10212CS292 - Applied Programming Skills
// Unit: Unit 1
// Week: Week 1
// Problem: Running Sum of 1D Array
// Platform: LeetCode

class Solution {
    public int[] runningSum(int[] nums) {
        for(int i=1;i<nums.length;i++)
       nums[i]=nums[i]+nums[i-1];
       return nums;        
    }
}
