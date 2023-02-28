public class BoxBlur {
    int[][] solution(int[][] image) {
        // M: the number of row in `image`
        // N: the number of column in `image`
        // time: O(M * N)
        // space: O(1)
        int m = image.length;
        int n = image[0].length;

        int[][] res = new int[m - 2][n - 2];

        for (int i = 1; i < m - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                int sum = 0;
                for (int r = i - 1; r <= i + 1; r++) {
                    for (int c = j - 1; c <= j + 1; c++) {
                        sum += image[r][c];
                    }
                }
                res[i - 1][j - 1] = sum / 9;
            }
        }

        return res;
    }
}
