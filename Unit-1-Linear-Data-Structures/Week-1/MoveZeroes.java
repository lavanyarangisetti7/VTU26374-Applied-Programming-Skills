// Name: R. Lavanya
// ID: vtu26374
// Subject: 10212CS292 - Applied Programming Skills
// Unit: Unit 1
// Week: Week 1
// Problem: Move Zeroes
// Platform: LeetCode

class Solution {
    public void moveZeroes(int[] nums) {
        int j = 0;  
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                
                j++;
            }
        }
    }
}
