package core;

public class TennisSet {
    boolean solution(int score1, int score2) {
        // time: O(1)
        // space: O(1)
        if (Math.max(score1, score2) == 7 && (Math.min(score1, score2) == 5 || Math.min(score1, score2) == 6)) {
            return true;
        }
        if (Math.max(score1, score2) == 6 && Math.min(score1, score2) < 5) {
            return true;
        }

        return false;
    }
}
