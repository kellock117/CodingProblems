class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        List<List<Integer>> answer = new ArrayList<>();
        
        while(i < nums.length - 2) {
            int l = i + 1, r = nums.length - 1;
            
            while(l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == 0) {
                    answer.add(Arrays.asList(nums[i], nums[l], nums[r]));
                    
                    for(int j = l + 1; j < r; j++) {
                        if(nums[j - 1] != nums[j]) break;
                        l += 1;
                    }
                    l += 1; 
                }
                else if(sum > 0) r -= 1;
                else l += 1;
            }
            
            for(int j = i + 1; j < nums.length - 2; j++) {
                if(nums[j - 1] != nums[j]) break;
                i += 1;
            }
            i += 1;
        }
        
        return answer;
    }
}

// https://leetcode.com/problems/3sum/submissions/
// Runtime: 36 ms, faster than 58.37% of Java online submissions for 3Sum.
// Memory Usage: 58.3 MB, less than 76.53% of Java online submissions for 3Sum.
