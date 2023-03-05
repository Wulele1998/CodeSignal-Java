public class IsBeautifulString {
    boolean solution(String inputString) {
        // N: the length of `inputString`
        // time: O(N)
        // space: O(1)
        int[] letters = new int[26];
        for (char c : inputString.toCharArray()) {
            letters[c - 'a']++;
        }
        for (int i = 1; i < 26; i++) {
            if (letters[i] > letters[i - 1]) {
                return false;
            }
        }
        return true;
    }
}
