// Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.

// A subarray is a contiguous part of an array.

// Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
// Output: 6
// Explanation: [4,-1,2,1] has the largest sum = 6.


class Solution {
    public int maxSubArray(int[] nums) { 
        int curr_subArray =nums[0];
        int max_subArray = nums[0];
        
        for(int i =1; i< nums.length; i++){
            int num = nums[i];
            curr_subArray = Math.max(num, num+curr_subArray);
            max_subArray = Math.max(curr_subArray, max_subArray);
        }             
        return max_subArray;      
        
    }
}


