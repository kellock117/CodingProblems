class Solution {
public:
    vector<int> sortedSquares(vector<int>& nums) {
        int length = nums.size();
        vector<int> output(length);
        int lo = 0;
        int hi = length - 1;
        
        for (int i = length - 1; i >= 0; i--) {    
            if (abs(nums[lo]) > abs(nums[hi])) {
                output[i] = nums[lo] * nums[lo];
                lo++;
            }
            else {
                output[i] = nums[hi] * nums[hi];
                hi--;
            }
        }
        
        return output;
    }
};

// https://leetcode.com/problems/squares-of-a-sorted-array/
// Runtime: 48 ms, faster than 46.33% of C++ online submissions for Squares of a Sorted Array.
// Memory Usage: 25.9 MB, less than 55.90% of C++ online submissions for Squares of a Sorted Array.
