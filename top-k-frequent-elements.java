class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<Integer, Integer>();
        
        for(int i : nums) {
            hs.put(i, hs.getOrDefault(i, 0) + 1);
        }
        
        List<Integer>[] frequencyList = new List[nums.length + 1];
        
        hs.forEach((key, value) -> {
            if(frequencyList[value] == null) {
                frequencyList[value] = new ArrayList<>();
            }
            
            frequencyList[value].add(key);
        });
            
        List<Integer> answer = new ArrayList<>();
        
        for(int i = nums.length; i >= 0 && answer.size() < k; i--) {
            if(frequencyList[i] != null) {
                answer.addAll(frequencyList[i]);
            }
        }
        
        return answer.stream().mapToInt(i -> i).toArray();
    }
}



// https://leetcode.com/problems/top-k-frequent-elements/submissions/
// Runtime: 11 ms, faster than 93.27% of Java online submissions for Top K Frequent Elements.
// Memory Usage: 44.7 MB, less than 97.17% of Java online submissions for Top K Frequent Elements.
