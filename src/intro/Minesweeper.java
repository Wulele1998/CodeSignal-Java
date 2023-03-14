package intro;

public class Minesweeper {
    int[][] solution(boolean[][] matrix) {
        // M: the row
        // N: the column
        // time: O(M * N)
        // space: O(1)
        final int[][] DIRECTIONS = new int[][] {
                { 1, 1 }, { 1, 0 }, { 0, 1 }, { 0, -1 },
                { 1, -1 }, { -1, -1 }, { -1, 1 }, { -1, 0 }
        };
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] res = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                for (int[] dir : DIRECTIONS) {
                    int r = i + dir[0];
                    int c = j + dir[1];
                    if (r >= 0 && r < m && c >= 0 && c < n && matrix[r][c]) {
                        count++;
                    }
                }
                res[i][j] = count;
            }
        }

        return res;
    }
}
