package intro;

public class DeleteDigit {
    int solution(int n) {
        // N: n
        // time: O(log N)
        int max = 0;

        for (int d = 1; d < n; d *= 10) {
            int num = n / (d * 10) * d + n % d;
            max = Math.max(num, max);
        }

        return max;
    }
}
