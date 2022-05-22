class Solution {
public:
    int searchInsert(vector<int>& nums, int target) {
        int low = 0;
        int high = nums.size() - 1;
        int mid;
        
        while(low <= high) {
            mid = low + (high - low) / 2;
            
            if(nums[mid] < target) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        
        if(target > nums[mid]) {
            return mid + 1;
        }
        else {
            return mid;
        }
    }
};

// Runtime: 8 ms, faster than 38.69% of C++ online submissions for Search Insert Position.
// Memory Usage: 9.7 MB, less than 23.59% of C++ online submissions for Search Insert Position.
//https://leetcode.com/problems/search-insert-position/submissions/
