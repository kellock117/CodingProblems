class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int highest = 0;
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int left = 0, right = 0;
        int sum = 0;
        
        while(right < nums.length) {
            if(map.containsKey(nums[right])) {
                int val = map.get(nums[right]);
                while(val >= left) {
                    map.remove(nums[left]);
                    sum -= nums[left];
                    left++;
                }
            }
            
            map.put(nums[right], right);
            sum += nums[right];
            
            highest = Math.max(highest, sum);
            right++;
        }
        
        return highest;
    }
}

// https://leetcode.com/problems/maximum-erasure-value/submissions/
// Runtime: 98 ms, faster than 52.19% of Java online submissions for Maximum Erasure Value.
// Memory Usage: 121 MB, less than 32.89% of Java online submissions for Maximum Erasure Value.
