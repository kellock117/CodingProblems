class Solution {
    public boolean canJump(int[] nums) {
        int reachableDistance = 0;

        for(int i = 0; i < nums.length - 1; i++) {
            reachableDistance = Math.max(reachableDistance, i + nums[i]);
            if(reachableDistance == i) return false;
        }

        return true;
    }
}

// https://leetcode.com/problems/jump-game/submissions/839305694/
// Runtime
// 2 ms
// Beats
// 95.2%
// Memory
// 42.7 MB
// Beats
// 92.52%
