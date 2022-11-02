class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        char[] a = new char[26];
        char[] b = new char[26];
        
        for(int i = 0; i < s.length(); i++) {
            a[s.charAt(i) - 'a']++;
            b[t.charAt(i) - 'a']++;
        }
        
        return Arrays.equals(a, b);
    }
}


// https://leetcode.com/problems/valid-anagram/submissions/
// Runtime: 3 ms, faster than 96.15% of Java online submissions for Valid Anagram.
// Memory Usage: 42.5 MB, less than 89.09% of Java online submissions for Valid Anagram.
