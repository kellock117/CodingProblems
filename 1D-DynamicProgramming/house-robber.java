class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);
        int length = nums.length;
        
        nums[2] = nums[2] + nums[0];
        
        for(int i = 3; i < length; i++) {
            nums[i] += Math.max(nums[i - 3], nums[i - 2]);
        }
            
            
        return Math.max(nums[length - 2], nums[length - 1]);
    }
}


// https://leetcode.com/problems/house-robber/submissions/
// Runtime: 0 ms, faster than 100.00% of Java online submissions for House Robber.
// Memory Usage: 41.6 MB, less than 43.10% of Java online submissions for House Robber.
