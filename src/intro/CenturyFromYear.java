package intro;

public class CenturyFromYear {
    int solution(int year) {
        // time: O(1)
        // space: O(1)
        if (year % 100 == 0) {
            return year / 100;
        } else {
            return year / 100 + 1;
        }
    }
}
