package core;

public class MaxMultiple {
    int solution(int divisor, int bound) {
        // time: O(1)
        // space: O(1)
        return bound - bound % divisor;
    }
}
