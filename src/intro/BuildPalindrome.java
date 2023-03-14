package intro;

public class BuildPalindrome {
    String solution(String st) {
        // N: the length of `st`
        // time: O(N ^ 2)
        // space: O(N) => reverse
        String reverse = new StringBuilder(st).reverse().toString();

        for (int i = 0; i < st.length(); i++) {
            String subStr = st.substring(i);
            // startWith function needs O(N)
            if (reverse.startsWith(subStr)) {
                return st.substring(0, i) + reverse;
            }
        }

        return "";
    }
}
