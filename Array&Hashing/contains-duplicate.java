class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<Integer>();
		
		for(int i = 0; i < nums.length; i++) {
			if(set.contains(nums[i]))
				return true;
			
			set.add(nums[i]);
		}
		
		return false;
    }
}



// https://leetcode.com/problems/contains-duplicate/submissions/
// Runtime: 14 ms, faster than 79.78% of Java online submissions for Contains Duplicate.
// Memory Usage: 67.9 MB, less than 76.63% of Java online submissions for Contains Duplicate.
