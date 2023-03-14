package core;

public class LateRide {
    int solution(int n) {
        // time: O(1)
        // space: O(1)
        int hour = n / 60;
        int minute = n % 60;

        int sum = 0;
        while (hour > 0) {
            sum += hour % 10;
            hour /= 10;
        }

        return sum + minute % 10 + minute / 10;
    }
}
