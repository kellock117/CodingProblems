class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 1) return 1;
        int longest = 0;
        
        for(int l = 0, r = 1; r < s.length(); r++) {
            int i = s.substring(l, r).indexOf(s.charAt(r));
            if(i != -1) {
                l = l + i + 1;
            }
            longest = Math.max(longest, r - l + 1);
        }
        
        return longest;
    }
}


// https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
// Runtime: 9 ms, faster than 76.62% of Java online submissions for Longest Substring Without Repeating Characters.
// Memory Usage: 50 MB, less than 18.84% of Java online submissions for Longest Substring Without Repeating Characters.
