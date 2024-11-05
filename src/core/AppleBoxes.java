package core;

public class AppleBoxes {
    int solution(int k) {
        // time: O(N)

        int yellow = 0;
        int red = 0;

        for (int i = 1; i <= k; i++) {
            if (i % 2 == 0) {
                red += i * i;
            } else {
                yellow += i * i;
            }
        }

        return red - yellow;
    }
}
