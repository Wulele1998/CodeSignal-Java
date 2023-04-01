package core;

public class MagicalWell {
    int solution(int a, int b, int n) {
        // time: O(N)
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += (a++) * (b++);
        }

        return sum;
    }
}
