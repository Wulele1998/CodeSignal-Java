package core;

public class SeatsInTheater {
    int solution(int nCols, int nRows, int col, int row) {
        // time: O(1)
        // space: O(1)
        return (nCols - col + 1) * (nRows - row);
    }
}
