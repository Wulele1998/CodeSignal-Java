package core;

public class KnapsackLight {
    int solution(int value1, int weight1, int value2, int weight2, int maxW) {
        // time: O(1)
        // space: O(1)
        if (Math.min(weight1, weight2) > maxW) {
            return 0;
        }

        if (maxW < weight1) {
            return value2;
        }

        if (maxW < weight2) {
            return value1;
        }

        if (maxW >= weight1 + weight2) {
            return value1 + value2;
        }

        return Math.max(value1, value2);
    }
}
