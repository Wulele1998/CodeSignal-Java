public class Sudoku {
    boolean solution(int[][] grid) {
        // grid is 9 * 9
        // time: O(1)
        // space: O(1)
        boolean[] visited;

        for (int i = 0; i < 9; i++) {
            // check each row
            visited = new boolean[10];
            for (int j = 0; j < 9; j++) {
                if (visited[grid[i][j]]) {
                    return false;
                }
                visited[grid[i][j]] = true;
            }
            // check each column
            visited = new boolean[10];
            for (int j = 0; j < 9; j++) {
                if (visited[grid[j][i]]) {
                    return false;
                }
                visited[grid[j][i]] = true;
            }
        }

        // check each 3 * 3 cell
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                visited = new boolean[10];
                for (int k = i; k < i + 3; k++) {
                    for (int l = j; l < j + 3; l++) {
                        if (visited[grid[k][l]]) {
                            return false;
                        }
                        visited[grid[k][l]] = true;
                    }
                }
            }
        }

        return true;
    }
}
