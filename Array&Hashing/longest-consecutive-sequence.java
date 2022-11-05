class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet hs = new HashSet<Integer>();
        ArrayList<Integer> alist = new ArrayList<Integer>();
        int longest = 0;
        
        for(int i = 0; i < nums.length; i++) {
            hs.add(nums[i]);
        }
        
        for(int i = 0; i < nums.length; i++) {
            if(!hs.contains(nums[i] - 1)) {
                int currValue = nums[i];
                int currLength = 1;

                while(true) {
                    if(hs.contains(++currValue)) currLength++;
                    else break;
                }

                longest = Math.max(longest, currLength);
            }
        }
        
        return longest;
    }
}


// https://leetcode.com/problems/longest-consecutive-sequence/submissions/
// Runtime: 395 ms, faster than 39.09% of Java online submissions for Longest Consecutive Sequence.
// Memory Usage: 59.6 MB, less than 89.25% of Java online submissions for Longest Consecutive Sequence.
