package intro;

public class AlternatingSums {
    int[] solution(int[] a) {
        // N: the length of `a`
        // time: O(N)
        // space: O(1)
        int sum1 = 0;
        int sum2 = 0;
        int n = a.length;

        for (int i = 0; i < n; i += 2) {
            sum1 += a[i];
            sum2 += (i + 1 < n) ? a[i + 1] : 0;
        }

        return new int[] { sum1, sum2 };
    }
}
