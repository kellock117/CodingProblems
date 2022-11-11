class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> s = new Stack<Integer>();
        int[] answer = new int[temperatures.length];
        
        for(int i = 0; i < temperatures.length; i++) {
            while(!s.empty() && temperatures[s.peek()] < temperatures[i]) {
                int idx = s.pop();
                answer[idx] = i - idx;
            }   
            
            s.push(i);
        }
        
        return answer;
    }
}

// https://leetcode.com/problems/daily-temperatures/submissions/
// Runtime: 129 ms, faster than 72.61% of Java online submissions for Daily Temperatures.
// Memory Usage: 54.7 MB, less than 90.62% of Java online submissions for Daily Temperatures.
