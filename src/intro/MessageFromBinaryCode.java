package intro;

public class MessageFromBinaryCode {
    String solution(String code) {
        // N: the length of `code`
        // time: O(N)
        // space: O(1)
        StringBuilder sb = new StringBuilder();
        int n = code.length();

        for (int i = 0; i < n; i += 8) {
            int base = 1;
            int sum = 0;
            for (int j = i + 7; j >= i; j--) {
                sum += base * (code.charAt(j) - '0');
                base *= 2;
            }
            sb.append((char) sum);
        }

        return sb.toString();
    }
}
