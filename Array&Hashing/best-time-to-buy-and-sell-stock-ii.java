class Solution {
    public int maxProfit(int[] nums) {
        int profit = 0;
		
		for(int i = 0; i < nums.length - 1; i++) {
			if(nums[i] < nums[i + 1])
				profit += nums[i + 1] - nums[i];
		}
		
		return profit;
    }
}

// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/submissions/841336715/
// Runtime
// 1 ms
// Beats
// 97.21%
// Memory
// 44.2 MB
// Beats
// 48.17%
