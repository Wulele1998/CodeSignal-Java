package intro;

public class SpiralNumbers {
    int[][] solution(int n) {
        // N: n
        // time: O(N ^ 2)
        // space: O(1)
        int[][] res = new int[n][n];
        int start = 1;

        for (int level = 0; level < n / 2; level++) {
            // up
            for (int i = level; i < n - 1 - level; i++) {
                res[level][i] = start++;
            }

            // right
            for (int i = level; i < n - 1 - level; i++) {
                res[i][n - 1 - level] = start++;
            }

            // down
            for (int i = n - 1 - level; i >= level + 1; i--) {
                res[n - 1 - level][i] = start++;
            }

            // left
            for (int i = n - 1 - level; i >= level + 1; i--) {
                res[i][level] = start++;
            }
        }

        // center
        if (n % 2 != 0) {
            res[n / 2][n / 2] = start;
        }

        return res;
    }
}
