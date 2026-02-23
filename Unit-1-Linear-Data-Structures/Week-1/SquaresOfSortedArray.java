// Name: R. Lavanya
// VTU NO.: vtu26374
// Subject: 10212CS292 - Applied Programming Skills
// Unit: Unit 1
// Week: Week 1
// Problem: Squares of a Sorted Array
// Platform: LeetCode

import java.util.Arrays;
class Solution {
    public int[] sortedSquares(int[] nums) {
     int[] res = new int[nums.length];
     for(int i = 0; i<nums.length; i++)
     res[i]=nums[i]*nums[i];
     Arrays.sort(res);
     return res;
    }
}
