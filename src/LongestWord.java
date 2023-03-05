public class LongestWord {
    String solution(String text) {
        // N: the length of `text`
        // time: O(N)
        // space: O(1)
        int maxLen = 0;
        int n = text.length();
        int count = 0;
        int end = 0;

        for (int i = 0; i < n; i++) {
            if (Character.isLetter(text.charAt(i))) {
                count++;
            } else {
                if (count > maxLen) {
                    end = i;
                    maxLen = count;
                }
                count = 0;
            }
        }

        if (count > maxLen) {
            maxLen = count;
            end = n;
        }

        return text.substring(end - maxLen, end);
    }
}
