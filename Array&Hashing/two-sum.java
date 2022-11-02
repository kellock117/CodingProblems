class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        for(int i = 0; i < nums.length; i++) {
            int gap = target - nums[i];
            if(map.containsKey(gap)) {
                return new int[] {i, map.get(gap)};
            }
            else {
                map.put(nums[i], i);
            } 
        }
        
        return new int[0]; 
    }
}

// https://leetcode.com/problems/two-sum/submissions/
// Runtime: 1 ms, faster than 99.76% of Java online submissions for Two Sum.
// Memory Usage: 42.2 MB, less than 98.51% of Java online submissions for Two Sum.
