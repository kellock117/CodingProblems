// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/submissions/
// 03/25/2022 15:16	Accepted	2 ms	58.9 MB	java

class Solution {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = prices[0];
            
        int profit = 0;
            
        for(int i = 1; i < prices.length; i++){
            if(min > prices[i]){
                min = prices[i];
                max = 0;
            }
            else {
                max = Math.max(max, prices[i]);
                profit = Math.max(profit, max - min);
            }
        }
        
        return profit;
    }
}