class Solution {
    public boolean compare(int[] c1, int[] c2) {
        for(int i = 0; i < 26; i++) {
            if(c1[i] != c2[i]) return false;
        }
        
        return true;
    }
    
    public boolean checkInclusion(String s1, String s2) {
        if(s2.length() < s1.length()) return false;
        if(s1.length() == 1) return s2.contains(s1);
        
        int[] s1IntArray = new int[26];
        int[] s2IntArray = new int[26];
        
        for(int i = 0; i < s1.length(); i++) {
            s1IntArray[s1.charAt(i) - 'a'] += 1;
        }
        
        for(int i = 0; i < s1.length() - 1; i++) {
            s2IntArray[s2.charAt(i) - 'a'] += 1;
        }
        
        for(int i = s1.length() - 1; i < s2.length(); i++) {
            s2IntArray[s2.charAt(i) - 'a'] += 1;
            
            if(compare(s1IntArray, s2IntArray)) return true;
            else {
                s2IntArray[s2.charAt(i - s1.length() + 1) - 'a'] -= 1;
            }
        }
        
        return false;
    }
}


// https://leetcode.com/problems/permutation-in-string/submissions/
// Runtime: 4 ms, faster than 98.00% of Java online submissions for Permutation in String.
// Memory Usage: 41.9 MB, less than 96.98% of Java online submissions for Permutation in String.
