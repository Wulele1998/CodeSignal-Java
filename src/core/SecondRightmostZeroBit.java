package core;

public class SecondRightmostZeroBit {
    int solution(int n) {
        // fill the rightmost 0 with 1 using `n | (n + 1)`
        // get the new rightmost 0 using ~n & (n + 1)
        // for example:
        // n: 1010011
        // ~n: 0101100
        // n + 1: 1010100
        // ~n & (n + 1): 0000100
        // time: O(1)
        return ~(n | (n + 1)) & ((n | (n + 1)) + 1);
    }
}