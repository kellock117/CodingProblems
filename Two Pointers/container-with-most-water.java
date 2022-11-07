class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int maximum = 0;
        
        while(l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            
            maximum = Math.max(maximum, area);

            if(height[l] < height[r]) l++;
            else r--;
            
        }
        
        return maximum;
    }
}

// https://leetcode.com/problems/container-with-most-water/submissions/
// Runtime: 3 ms, faster than 97.42% of Java online submissions for Container With Most Water.
// Memory Usage: 52.8 MB, less than 90.19% of Java online submissions for Container With Most Water.
