// https://leetcode.com/problems/climbing-stairs/
// 03/25/2022 14:41 Accepted 0 ms 41.7 MB java
class Solution {
    public int climbStairs(int n) {
        int[] vec = new int [n + 1];
        vec[1] = vec[0] = 1 ;
            
        for(int i = 2; i <= n; i++){
            vec[i] = vec[i - 1] + vec[i - 2];
        }
        
        return vec[n];
    }
}