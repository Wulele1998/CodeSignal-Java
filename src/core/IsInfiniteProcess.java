package core;

public class IsInfiniteProcess {
    boolean solution(int a, int b) {
        // time: O(1)
        // space: O(1)
        return a > b || (b - a) % 2 != 0;
    }
}
