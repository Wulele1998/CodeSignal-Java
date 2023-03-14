package core;

public class LargestNumber {
    int solution(int n) {
        // N: n
        // time: O(N)
        // space: O(1)
        int res = 0;
        int base = 1;

        for (int i = 0; i < n; i++) {
            res += base * 9;
            base *= 10;
        }

        return res;
    }
}
