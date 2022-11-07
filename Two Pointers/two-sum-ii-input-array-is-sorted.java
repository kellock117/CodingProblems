class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        
        while(l < r) {
            if(numbers[l] + numbers[r] == target) return new int[] {l + 1, r + 1};
            else if(numbers[l] + numbers[r] < target) l++;
            else r--;
        }
        
        return new int[0];
    }
}

// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/submissions/
// Runtime: 2 ms, faster than 80.12% of Java online submissions for Two Sum II - Input Array Is Sorted.
// Memory Usage: 50.3 MB, less than 28.27% of Java online submissions for Two Sum II - Input Array Is Sorted.
