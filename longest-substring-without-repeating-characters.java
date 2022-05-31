class Solution {
    public int lengthOfLongestSubstring(String s) {
        int longest = 0;
        String str = "";
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (str.indexOf(c) != -1) {
                str = str.substring(str.indexOf(c) + 1);
            }            
            str += c;
            longest = Math.max(longest, str.length());            
        }
        
        return longest;
    }
}

// https://leetcode.com/problems/longest-substring-without-repeating-characters/submissions/
// Runtime: 28 ms, faster than 21.40% of Java online submissions for Longest Substring Without Repeating Characters.
// Memory Usage: 54.4 MB, less than 13.76% of Java online submissions for Longest Substring Without Repeating Characters.
