public class ShapeArea {
    int solution(int n) {
        // N: n
        // time: O(N)
        // space: O(1)
        int res = 1;

        for (int i = 1; i < n; i++) {
            res += i * 4;
        }

        return res;
    }
}
