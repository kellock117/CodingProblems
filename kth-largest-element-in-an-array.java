public int findKthLargest(int[] nums, int k) {
      PriorityQueue<Integer> pq = new PriorityQueue<>();

      for(int i = 0; i < nums.length; i++) {
          if(pq.size() >= k) {
            if(pq.peek() < nums[i]) {
              pq.remove();
              pq.add(nums[i]);
            }
          }
          else {
              pq.add(nums[i]);
          }
      }

      return pq.peek();
}

public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        
        return nums[nums.length - k];
}


// https://leetcode.com/problems/kth-largest-element-in-an-array/submissions/
// Runtime: 27 ms, faster than 22.37% of Java online submissions for Kth Largest Element in an Array.
// Memory Usage: 69.6 MB, less than 14.89% of Java online submissions for Kth Largest Element in an Array.
