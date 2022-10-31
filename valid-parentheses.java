class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 == 1) return false;
        Stack<Character> q = new Stack<Character>();
        
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if(c == '(' || c == '{' || c == '[') q.push(c);
            else if(q.size() > 0) {
                char peek = q.peek();
                
                if(c == ')' && peek == '(') q.pop();
                else if(c == '}' && peek == '{') q.pop();
                else if(c == ']' && peek == '[') q.pop();
                else return false;
            }
            else return false;
        }
        
        return q.size() == 0 ? true : false ;
    }
}

// https://leetcode.com/problems/valid-parentheses/submissions/
// Runtime: 1 ms, faster than 99.79% of Java online submissions for Valid Parentheses.
// Memory Usage: 40.2 MB, less than 94.07% of Java online submissions for Valid Parentheses.
