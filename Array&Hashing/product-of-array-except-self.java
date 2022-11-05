class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] arr = new int[nums.length];
        Arrays.fill(arr, 1);

        int currVal = 1;
        for(int i = 0; i < nums.length; i++) {
            arr[i] *= currVal;
            currVal *= nums[i];
        }

        currVal = 1;
        for(int i = nums.length - 1; i >= 0; i--) {
            arr[i] *= currVal;
            currVal *= nums[i];
        }

        return arr;
    }
}

// https://leetcode.com/problems/product-of-array-except-self/submissions/837218387/
// Runtime
// 2 ms
// Beats
// 89.6%
  
// Memory
// 50.3 MB
// Beats
// 95.59%
