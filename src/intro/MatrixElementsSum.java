package intro;

public class MatrixElementsSum {
    int solution(int[][] matrix) {
        // M: the number of rows in `matrix`
        // N: the number of columns in `matrix`
        // time: O(M * N)
        // space: O(1)
        int m = matrix.length;
        int n = matrix[0].length;
        int res = 0;

        for (int col = 0; col < n; col++) {
            for (int row = 0; row < m; row++) {
                if (matrix[row][col] == 0) {
                    break;
                } else {
                    res += matrix[row][col];
                }
            }
        }

        return res;
    }
}
