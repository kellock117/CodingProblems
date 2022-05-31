class Solution {
    public String reverseWords(String s) {
        String output = "";
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            StringBuffer sb = new StringBuffer(arr[i]);
            output += sb.reverse().toString() + " ";
        }
        
        return output.substring(0, output.length() - 1);
    }
}

// // https://leetcode.com/problems/reverse-words-in-a-string-iii/submissions/
// Runtime: 22 ms, faster than 30.08% of Java online submissions for Reverse Words in a String III.
// Memory Usage: 43.2 MB, less than 78.78% of Java online submissions for Reverse Words in a String III.
