package core;

public class KillKthBit {
    int solution(int n, int k) {
        // time: O(1)
        // space: O(1)
        return n & (~(1 << k - 1));
    }
}
