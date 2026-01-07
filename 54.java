import java.util.*;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> r = new ArrayList<>();
        if (matrix == null || matrix.length == 0) return result;     
        int m = matrix.length;
        int n = matrix[0].length;     
        int top = 0, bottom = m - 1;
        int left = 0, right = n - 1;     
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                r.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                r.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    r.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    r.add(matrix[i][left]);
                }
                left++;
            }
        } 
        return result;
    }
}
