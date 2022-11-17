class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int[] length = new int[points.length];

        for(int i = 0; i < points.length; i++) {
            length[i] = distance(points[i]);
        }

        Arrays.sort(length);
        int kthSmallest = length[k - 1];
        int[][] answer = new int[k][2];

        for(int i = 0, number = 0; i < points.length && number < k; i++) {
            if(distance(points[i]) <= kthSmallest) {
                answer[number++] = points[i];
            }
        }

        return answer;
    }

    public int distance(int[] point) {
        return point[0] * point[0] + point[1] * point[1];
    }
}


// https://leetcode.com/problems/k-closest-points-to-origin/submissions/844985931/
// Runtime
// 29 ms
// Beats
// 90.40%
// Memory
// 116.4 MB
// Beats
// 59.83%
