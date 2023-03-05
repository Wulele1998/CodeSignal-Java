public class BishopAndPawn {
    boolean solution(String bishop, String pawn) {
        // time: O(1)
        // space: O(1)
        int bishopX = bishop.charAt(0) - 'a';
        int bishopY = bishop.charAt(1) - '0';
        int pawnX = pawn.charAt(0) - 'a';
        int pawnY = pawn.charAt(1) - '0';

        return Math.abs(bishopX - pawnX) == Math.abs(bishopY - pawnY);
    }
}
