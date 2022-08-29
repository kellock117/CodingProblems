class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1) return false;
        Stack<Character> q = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == '(' || c == '{' || c == '[') q.push(c);
            else if(q.size() > 0) {
                if(c == ')' && q.peek() == '(') q.pop();
                else if(c == '}' && q.peek() == '{') q.pop();
                else if(c == ']' && q.peek() == '[') q.pop();
                else q.push(c);
            }
            else q.push(c);
        }
        
        return q.size() == 0 ? true : false ;
    }
}

// https://leetcode.com/problems/valid-parentheses/submissions/
// Runtime: 1 ms, faster than 99.63% of Java online submissions for Valid Parentheses.
// Memory Usage: 40.3 MB, less than 94.15% of Java online submissions for Valid Parentheses.
