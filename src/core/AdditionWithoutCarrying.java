package core;

public class AdditionWithoutCarrying {
    int solution(int param1, int param2) {
        // time: O(log max(N, M))
        int base = 1;
        int res = 0;

        while (param1 > 0 || param2 > 0) {
            int digit1 = 0;
            int digit2 = 0;
            if (param1 > 0) {
                digit1 = param1 % 10;
            }
            if (param2 > 0) {
                digit2 = param2 % 10;
            }
            res += (digit1 + digit2) % 10 * base;
            base *= 10;
            param1 /= 10;
            param2 /= 10;
        }

        return res;
    }
}
