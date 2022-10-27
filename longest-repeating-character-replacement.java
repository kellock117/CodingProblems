class Solution {
    public int characterReplacement(String s, int k) {
        int[] charArray = new int[26];
        int answer = 0;
        int longest = 0;
        int l = 0, r = 1;
        charArray[s.charAt(l) - 'A'] += 1;
        
        while(r < s.length()) {
            longest = Math.max(longest, ++charArray[s.charAt(r) - 'A']);
            int length = r - l + 1;
            int currVal = Math.min(length, longest + k);
            answer = Math.max(longest, currVal);
            
            if(currVal < length) {
                charArray[s.charAt(l) - 'A'] -= 1;
                l += 1;
            };
            r += 1;
        }
        
        return answer;
    }
}




// https://leetcode.com/problems/longest-repeating-character-replacement/submissions/
// Runtime: 9 ms, faster than 82.61% of Java online submissions for Longest Repeating Character Replacement.
// Memory Usage: 43.6 MB, less than 34.62% of Java online submissions for Longest Repeating Character Replacement.
