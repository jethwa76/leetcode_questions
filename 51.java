import java.util.*;
class Solution {
    List<List<String>> result = new ArrayList<>();
    boolean[] cols, diag1, diag2;
    char[][] board;
    public List<List<String>> solveNQueens(int n) {
        cols = new boolean[n];
        diag1 = new boolean[2 * n - 1]; 
        diag2 = new boolean[2 * n - 1];
        board = new char[n][n];
        for (int i = 0; i < n; i++)
            Arrays.fill(board[i], '.');
        backtrack(0, n);
        return result;
    }
    private void backtrack(int row, int n) {
        if (row == n) {
            result.add(constructBoard());
            return;
        }
        for (int col = 0; col < n; col++) {
            int d1 = row - col + n - 1;
            int d2 = row + col;
            if (cols[col] || diag1[d1] || diag2[d2])
                continue;
            board[row][col] = 'Q';
            cols[col] = diag1[d1] = diag2[d2] = true;
            backtrack(row + 1, n);
            board[row][col] = '.';
            cols[col] = diag1[d1] = diag2[d2] = false;
        }
    }
    private List<String> constructBoard() {
        List<String> temp = new ArrayList<>();
        for (char[] row : board) {
            temp.add(new String(row));
        }
        return temp;
    }
}
