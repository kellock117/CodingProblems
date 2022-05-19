class Solution {
public:
    int search(vector<int>& nums, int target) {
        int low = 0;
        int high = nums.size() - 1;
        
        while(low <= high) {
            int mid = (low + high) / 2;
            
            if(target == nums[mid]) {
                return mid;
            }
            else if(target > nums[mid]) {
                low = mid + 1;
            }
            else {
                high = mid - 1;
            }
        }
        
        return -1;
    }
};

//Runtime: 63 ms, faster than 22.51% of C++ online submissions for Binary Search.
//Memory Usage: 27.5 MB, less than 92.51% of C++ online submissions for Binary Search.
//https://leetcode.com/problems/binary-search/submissions/
