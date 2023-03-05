public class ChessKnight {
    int solution(String cell) {
        final int N = 8;
        int cellX = cell.charAt(0) - 'a';
        int cellY = cell.charAt(1) - '1';
        int[] dirX = new int[] {2, -2};
        int[] dirY = new int[] {1, -1};
        int count = 0;

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                int x = cellX + dirX[i];
                int y = cellY + dirY[j];
                if (x >= 0 && x < N && y >= 0 && y < N) {
                    count++;
                }

                x = cellX + dirY[j];
                y = cellY + dirX[i];
                if (x >= 0 && x < N && y >= 0 && y < N) {
                    count++;
                }
            }
        }

        return count;
    }
}
