class Solution {
    public int maxSubArray(int[] nums) {
        int largest = nums[0];
        int currVal = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
            if(currVal < 0 && nums[i] > currVal) currVal = nums[i];
            else currVal += nums[i];
            
            largest = Math.max(largest, currVal);
        }
        
        return largest;
    }
}

// https://leetcode.com/problems/maximum-subarray/submissions/
// Runtime: 2 ms, faster than 79.45% of Java online submissions for Maximum Subarray.
// Memory Usage: 73.1 MB, less than 74.27% of Java online submissions for Maximum Subarray.
