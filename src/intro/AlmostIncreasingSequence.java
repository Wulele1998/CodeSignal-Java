package intro;

public class AlmostIncreasingSequence {
    boolean solution(int[] sequence) {
        // N: the length of `sequence`
        // time: O(N)
        // space: O(1)
        int n = sequence.length;
        int count = 0;

        for (int i = 1; i < n; i++) {
            if (sequence[i] <= sequence[i - 1]) {
                count++;
                if (i - 2 >= 0 && i + 1 < n && sequence[i - 2] >= sequence[i] && sequence[i - 1] >= sequence[i + 1]) {
                    return false;
                }
            }
            if (count > 2) {
                return false;
            }
        }

        return count <= 1;
    }
}
