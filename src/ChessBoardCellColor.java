public class ChessBoardCellColor {
    boolean solution(String cell1, String cell2) {
        int row1 = cell1.charAt(0) - 'A';
        int row2 = cell2.charAt(0) - 'A';
        int col1 = cell1.charAt(1) - '1';
        int col2 = cell2.charAt(1) - '1';

        return (row1 + col1) % 2 == (row2 + col2) % 2;
    }
}
