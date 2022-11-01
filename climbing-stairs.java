class Solution {
    public int climbStairs(int n) {
        if(n == 1) return 1;
        
        int val1 = 1, val2 = 2;
            
        for(int i = 3; i <= n; i++){
            int temp = val1 + val2;
            val1 = val2;
            val2 = temp;
        }
        
        return val2;
    }
}

// https://leetcode.com/problems/climbing-stairs/
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Climbing Stairs.
// Memory Usage: 40.9 MB, less than 37.22% of Java online submissions for Climbing Stairs.
