// Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
// Input: nums = [1,2,3,1]
// Output: true

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> hSet = new HashSet<Integer>(nums.length);
        for(int val: nums){
            if(hSet.contains(val)) return true;
            hSet.add(val);
        }
       return false;   
    }
}