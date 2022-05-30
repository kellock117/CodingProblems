class Solution {
public:
    void moveZeroes(vector<int>& nums) {
        int pointer = 0;
        for (int i = 0; i < nums.size(); i++) {
            if (nums[i] != 0) {
                nums[pointer] = nums[i];
                pointer++;
            }
        }
        fill(nums.begin() + pointer, nums.end(), 0);
    }
};

// https://leetcode.com/problems/move-zeroes/submissions/
// Runtime: 31 ms, faster than 57.20% of C++ online submissions for Move Zeroes.
// Memory Usage: 19.1 MB, less than 83.66% of C++ online submissions for Move Zeroes.
