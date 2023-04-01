package core;

public class LeastFactorial {
    int solution(int n) {
        int base = 1;
        int index = 1;

        while (base < n) {
            base *= ++index;
        }

        return base;
    }
}
