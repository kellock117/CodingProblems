class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int[] convertedPattern = convertString(pattern);
        List<String> outputList = new ArrayList<String>();
        
        for(int i = 0; i < words.length; i++) {
            if(Arrays.equals(convertedPattern, convertString(words[i]))) {
                outputList.add(words[i]);
            }
        }
        
        return outputList;
    }
    
    public int[] convertString(String str) {
        HashMap<Character, Integer> hs = new HashMap<Character, Integer>();
        int[] converted = new int[str.length()];
        
        for(int i = 0; i < str.length(); i++) {
            hs.putIfAbsent(str.charAt(i), hs.size());
            converted[i] = hs.get(str.charAt(i));
        }
        
        return converted;
    }
}

// https://leetcode.com/problems/find-and-replace-pattern/submissions/
// Runtime: 3 ms, faster than 54.32% of Java online submissions for Find and Replace Pattern.
// Memory Usage: 43.3 MB, less than 33.39% of Java online submissions for Find and Replace Pattern.
