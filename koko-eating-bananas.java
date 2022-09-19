class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int lo = 0, hi = findMax(piles);
        
        while(lo <= hi) {
            int k = lo + (hi - lo) / 2;
            
            if(eatAll(piles, k, h)) hi = k - 1;
            else lo = k + 1;
        }
        
        return lo;
    }
    
    public boolean eatAll(int[] piles, int k, int h) {
        if(k == 0) return false;
        int timeTaken = 0;
        for(int pile : piles) {
            timeTaken += pile / k;
            if (pile % k != 0) timeTaken += 1;
        }
        if(timeTaken > h) return false;
        
        return true;
    }
    
    public int findMax(int[] piles) {
        int max = Integer.MIN_VALUE;
        
        for(int pile: piles) {
            max = Math.max(max, pile);
        }
        
        return max;
    }
}

// https://leetcode.com/problems/koko-eating-bananas/submissions/
// Runtime: 23 ms, faster than 75.32% of Java online submissions for Koko Eating Bananas.
// Memory Usage: 53.9 MB, less than 58.43% of Java online submissions for Koko Eating Bananas.
