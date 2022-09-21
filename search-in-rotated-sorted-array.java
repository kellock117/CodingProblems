class Solution {
    public int findIndexOfLowestNumber(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            if(nums[i - 1] > nums[i]) return i;
        }
        
        return 0;
    }
    
    public int search(int[] nums, int target) {
        int idx = findIndexOfLowestNumber(nums);
        int lo = 0, hi = nums.length - 1;
        
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
            int rotatedMid = (mid + idx) % nums.length;
            
            if(nums[rotatedMid] == target) return rotatedMid;
            else if(nums[rotatedMid] > target) hi = mid - 1;
            else lo = mid + 1;
        }
        
        return -1;
    }
}


// https://leetcode.com/problems/search-in-rotated-sorted-array/submissions/
// Runtime: 1 ms, faster than 77.57% of Java online submissions for Search in Rotated Sorted Array.
// Memory Usage: 42.4 MB, less than 63.14% of Java online submissions for Search in Rotated Sorted Array.
