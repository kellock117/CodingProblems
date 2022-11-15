class KthLargest {
    PriorityQueue<Integer> pq;
    int len;

    public KthLargest(int k, int[] nums) {
        pq = new PriorityQueue<Integer>(k);
        len = k;
        for(int i = 0; i < nums.length; i++) {
            add(nums[i]);
        }
    }
    
    public int add(int val) {
        if(pq.size() < len) pq.add(val);
        else if(pq.peek() < val) {
            pq.poll();
            pq.add(val);
        }
        
        return pq.peek();
    }
}

https://leetcode.com/problems/kth-largest-element-in-a-stream/submissions/843737369/
Runtime
29 ms
Beats
68%
Memory
52.2 MB
Beats
66.55%
