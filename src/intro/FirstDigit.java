package intro;

public class FirstDigit {
    char solution(String inputString) {
        // N: the length of `inputString`
        // time: O(N)
        // space: O(1)
        for (char c : inputString.toCharArray()) {
            if (c - '0' >= 0 && c - '0' <= 9) {
                return c;
            }
        }
        return ' ';
    }
}
