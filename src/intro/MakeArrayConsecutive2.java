package intro;

public class MakeArrayConsecutive2 {
    int solution(int[] statues) {
        // N: the length of `statues`
        // time: O(N)
        // space: O(1)
        int maxVal = statues[0];
        int minVal = statues[0];
        int n = statues.length;

        for (int statue : statues) {
            maxVal = Math.max(maxVal, statue);
            minVal = Math.min(minVal, statue);
        }

        return maxVal - minVal + 1 - n;
    }
}
