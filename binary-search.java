class Solution {
    public int search(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        
        while(l <= r) {
            int center = (l + r) / 2;
            if(nums[center] == target) return center;
            else if(nums[center] < target) l = center + 1;
            else r = center - 1;
        }
        
        return -1;
    }
}

// https://leetcode.com/problems/binary-search/submissions/
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Binary Search.
// Memory Usage: 42.6 MB, less than 98.78% of Java online submissions for Binary Search.
