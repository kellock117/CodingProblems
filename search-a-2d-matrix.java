class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int lo = 0, hi = m * n - 1;
        
        while(lo <= hi) {
            int mid = (lo + hi) / 2;
            int row = mid / n, column = mid % n;
            
            if(matrix[row][column] == target)
                return true;
            else if(matrix[row][column] < target)
                lo = mid + 1;
            else
                hi = mid - 1;
        }
        
        return false;
    }
}

// https://leetcode.com/problems/search-a-2d-matrix/submissions/
// Runtime: 1 ms, faster than 39.71% of Java online submissions for Search a 2D Matrix.
// Memory Usage: 42.6 MB, less than 60.61% of Java online submissions for Search a 2D Matrix.
