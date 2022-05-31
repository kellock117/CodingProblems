class Solution {
public:
    void reverseString(vector<char>& s) {
        int length = s.size();
        for (int i = 0; i < length / 2; i++) {
            char temp = s[i];
            s[i] = s[length - i - 1];
            s[length - i - 1] = temp; 
        }
    }
};

// https://leetcode.com/problems/reverse-string/submissions/
// Runtime: 27 ms, faster than 61.04% of C++ online submissions for Reverse String.
// Memory Usage: 23.3 MB, less than 42.02% of C++ online submissions for Reverse String.
