class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");       
                
        for(int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) return false;
        } 
        
        return true;
    }
}


// https://leetcode.com/problems/valid-palindrome/submissions/
// Runtime: 26 ms, faster than 40.24% of Java online submissions for Valid Palindrome.
// Memory Usage: 47 MB, less than 32.42% of Java online submissions for Valid Palindrome.
