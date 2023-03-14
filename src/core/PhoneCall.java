package core;

public class PhoneCall {
    int solution(int min1, int min2_10, int min11, int s) {
        // time: O(1)
        // space: O(1)
        if (s < min1) {
            return 0;
        }

        if (s <= min1 + min2_10 * 9) {
            return 1 + (s - min1) / min2_10;
        }

        return 10 + (s - min1 - min2_10 * 9) / min11;
    }
}
