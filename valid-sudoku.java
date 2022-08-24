class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i = 0; i < board.length; i++) {
            HashSet rowHS = new HashSet<Character>();
            HashSet columnHS = new HashSet<Character>();
            HashSet subBoxHS = new HashSet<Character>();
        
            for(int j = 0; j < board[i].length; j++) {
                if(board[i][j] != '.' && rowHS.contains(board[i][j])) return false;
                rowHS.add(board[i][j]);
                
                if(board[j][i] != '.' && columnHS.contains(board[j][i])) return false;
                columnHS.add(board[j][i]);
                
                int rowIdx = 3 * (i / 3);
                int columnIdx = 3 * (i % 3);
                
                if(board[rowIdx + j / 3][columnIdx + j % 3] != '.' && subBoxHS.contains(board[rowIdx + j / 3][columnIdx + j % 3])) return false;
                subBoxHS.add(board[rowIdx + j / 3][columnIdx + j % 3]);
            }
        }
        
        return true;
    }
}


// https://leetcode.com/problems/valid-sudoku/submissions/
// Runtime: 8 ms, faster than 49.85% of Java online submissions for Valid Sudoku.
// Memory Usage: 48.6 MB, less than 15.31% of Java online submissions for Valid Sudoku.
