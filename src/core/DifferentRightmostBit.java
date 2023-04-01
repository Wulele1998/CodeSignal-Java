package core;

public class DifferentRightmostBit {
    int solution(int n, int m) {
        // 11: 1011
        // 13: 1101
        // 11 ^ 13: 0110
        // -(11 ^ 13): 11111111111111111111111111111010
        // (11 ^ 13) & (-(11 ^ 13)): 10
        return (n ^ m) & -(n ^ m);
    }
}
