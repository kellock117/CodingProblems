class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int val1 = cost[0], val2 = cost[1];
        
        for(int i = 2; i < cost.length; i++) {
            int newVal = Math.min(val1, val2) + cost[i];
            val1 = val2;
            val2 = newVal;
        }
        
        return Math.min(val1, val2);
    }
}

// https://leetcode.com/problems/min-cost-climbing-stairs/submissions/
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Min Cost Climbing Stairs.
// Memory Usage: 42.1 MB, less than 87.91% of Java online submissions for Min Cost Climbing Stairs.
