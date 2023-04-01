package core;

public class CountSumOfTwoRepresentation2 {
    int solution(int n, int l, int r) {
        // time: O(N)
        int count = 0;
        int one;
        int two;

        if (n % 2 == 0) {
            one = n / 2;
            two = n / 2;
        } else {
            one = n / 2;
            two = n / 2 + 1;
        }

        while (one >= l && two <= r) {
            count++;
            one--;
            two++;
        }

        return count;
    }

    int solution2(int n, int l, int r) {
        // time: O(1)
        if (n > r * 2 || n < l * 2) {
            return 0;
        }

        int one;
        int two;

        if (l + r < n) {
            two = r;
            one = n - r;
        } else {
            one = l;
            two = n - l;
        }

        return (two - one) / 2 + 1;
    }
}
