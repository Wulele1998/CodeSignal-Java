public class ValidTime {
    boolean solution(String time) {
        // time: O(1)
        // space: O(1)
        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(3));

        return hour >= 0 && hour <= 23 && minute >= 0 && minute <= 59;
    }
}
