class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0) return new ArrayList<>();
        
        HashMap<String, List<String>> hs = new HashMap<String, List<String>>();
        
        for(String s: strs) {
            char[] ca = s.toCharArray();
            Arrays.sort(ca);
            String key = String.valueOf(ca);
            
            hs.putIfAbsent(key, new ArrayList<String>());

            hs.get(key).add(s);
        }
        
        return new ArrayList<>(hs.values());
    }
}






// https://leetcode.com/problems/group-anagrams/submissions/
// Runtime: 12 ms, faster than 69.97% of Java online submissions for Group Anagrams.
// Memory Usage: 55.4 MB, less than 77.57% of Java online submissions for Group Anagrams.
