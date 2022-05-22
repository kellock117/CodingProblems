class Solution {
public:
    int firstBadVersion(int n) {
        if(n == 1) {
            return 1;
        }
        
        int low = 1;
        
        while(low <= n) {
            int mid = low + (n - low) / 2;
            bool prevValue = isBadVersion(mid - 1);
            bool value = isBadVersion(mid);
            
            if(value && !prevValue) {
                return mid;
            }
            else if(value) {
                n = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }
        
        return -1;
    }
};

// Runtime: 0 ms, faster than 100.00% of C++ online submissions for First Bad Version.
// Memory Usage: 6 MB, less than 23.83% of C++ online submissions for First Bad Version.
//https://leetcode.com/problems/first-bad-version/submissions/
