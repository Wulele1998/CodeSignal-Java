package intro;

public class PalindromeRearranging {
    boolean solution(String inputString) {
        // N: the length of `inputString`
        // time: O(N)
        // space: O(1)
        int[] dict = new int[26];
        for (char c : inputString.toCharArray()) {
            dict[c - 'a']++;
        }

        int oddCount = 0;
        for (int i = 0; i < 26; i++) {
            if (dict[i] % 2 != 0) {
                oddCount++;

                if (oddCount > 1) {
                    return false;
                }
            }
        }

        return true;
    }
}
