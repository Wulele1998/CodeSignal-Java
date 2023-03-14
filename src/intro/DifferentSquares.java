package intro;

import java.util.HashSet;

public class DifferentSquares {
    int solution(int[][] matrix) {
        // M: the number of row in `matrix`
        // N: the number of column in `matrix`
        // time: O(M * N)
        // space: O(M * N)
        HashSet<String> set = new HashSet<>();
        int m = matrix.length;
        int n = matrix[0].length;

        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                String s = matrix[i][j] + "," + matrix[i][j + 1] + "," + matrix[i + 1][j] + "," + matrix[i + 1][j + 1];
                set.add(s);
            }
        }

        return set.size();
    }
}
