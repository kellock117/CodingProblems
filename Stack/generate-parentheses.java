class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<String>();
        backtrack(list, "", 0, 0, n);
        
        return list;
    }
    
    void backtrack(List<String> l, String str, int open, int close, int max) {
        if(str.length() == max * 2) {
            l.add(str);
            return;
        }
        
        if(open < max) backtrack(l, str + '(', open + 1, close, max);
        if(close < open) backtrack(l, str + ')', open, close + 1, max);
    }
}

// https://leetcode.com/problems/generate-parentheses/submissions/
// Runtime: 3 ms, faster than 47.15% of Java online submissions for Generate Parentheses.
// Memory Usage: 43.3 MB, less than 77.88% of Java online submissions for Generate Parentheses.
