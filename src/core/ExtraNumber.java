package core;

public class ExtraNumber {
    int solution(int a, int b, int c) {
        // time: O(1)
        // space: O(1)
        if (a == b) {
            return c;
        }
        if (a == c) {
            return b;
        }

        return a;
    }
}
