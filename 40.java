import java.util.*;

class Solution {
    int[] dr = {1, -1, 0, 0};
    int[] dc = {0, 0, 1, -1};

    public int latestDayToCross(int r, int c, int[][] x) {
        int l = 1, h = r * c, a = 0;

        while (l <= h) {
            int m = (l + h) / 2;
            if (ok(r, c, x, m)) {
                a = m;
                l = m + 1;
            } else {
                h = m - 1;
            }
        }
        return a;
    }

    boolean ok(int r, int c, int[][] x, int d) {
        int[][] g = new int[r][c];
        for (int i = 0; i < d; i++) {
            g[x[i][0] - 1][x[i][1] - 1] = 1;
        }

        Queue<int[]> q = new LinkedList<>();
        boolean[][] v = new boolean[r][c];

        for (int j = 0; j < c; j++) {
            if (g[0][j] == 0) {
                q.add(new int[]{0, j});
                v[0][j] = true;
            }
        }

        while (!q.isEmpty()) {
            int[] t = q.poll();
            if (t[0] == r - 1) return true;

            for (int k = 0; k < 4; k++) {
                int nr = t[0] + dr[k];
                int nc = t[1] + dc[k];
                if (nr >= 0 && nc >= 0 && nr < r && nc < c &&
                    !v[nr][nc] && g[nr][nc] == 0) {
                    v[nr][nc] = true;
                    q.add(new int[]{nr, nc});
                }
            }
        }
        return false;
    }
}