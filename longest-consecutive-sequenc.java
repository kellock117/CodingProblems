class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Arrays.sort(nums);
        int longest = 1;
        int currLength = 1;
        
        for(int i = 0; i < nums.length - 1; i++) {
            if(nums[i + 1] == nums[i] + 1) {
                currLength++;
                longest = Math.max(longest, currLength);
            }
            else if(nums[i + 1] == nums[i]) {
                continue;
            }
            else {
                currLength = 1;
            }
        }
        
        return longest;
    }
}




// https://leetcode.com/problems/longest-consecutive-sequence/submissions/
// Runtime: 16 ms, faster than 96.72% of Java online submissions for Longest Consecutive Sequence.
// Memory Usage: 64.7 MB, less than 74.40% of Java online submissions for Longest Consecutive Sequence.
