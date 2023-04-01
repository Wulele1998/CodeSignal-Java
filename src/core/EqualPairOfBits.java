package core;

public class EqualPairOfBits {
    int solution(int n, int m) {
        return Integer.lowestOneBit(~(n ^ m));
    }
}
