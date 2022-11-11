class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> number = new Stack<Integer>();
        Stack<String> operator = new Stack<String>();

        for(int i = 0; i < tokens.length; i++) {
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/"))
                operator.push(tokens[i]);
            else
                number.push(Integer.parseInt(tokens[i]));

            if(number.size() >= 2 && operator.size() >= 1)
                number.push(calculate(number, operator));
        }

        return number.pop();
    }

    public int calculate(Stack<Integer> number, Stack<String> operator) {
        int first = number.pop();
        int second = number.pop();
        String op = operator.pop();

        if(op.equals("+")) return first + second;
        else if(op.equals("-")) return second - first; 
        else if(op.equals("*")) return first * second;
        return second / first;
    }
}


// https://leetcode.com/problems/evaluate-reverse-polish-notation/description/
// Runtime
// 9 ms
// Beats
// 80.10%
// Memory
// 42.3 MB
// Beats
// 84.37%
