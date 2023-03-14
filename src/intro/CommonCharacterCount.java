package intro;

public class CommonCharacterCount {
    int solution(String s1, String s2) {
        // M: the length of `s1`
        // N: the length of `s2`
        // time: O(M + N)
        // space: O(1)
        int[] dict = new int[26];
        int res = 0;

        for (char c : s1.toCharArray()) {
            dict[c - 'a']++;
        }

        for (char c : s2.toCharArray()) {
            if (dict[c - 'a'] != 0) {
                res++;
                dict[c - 'a']--;
            }
        }

        return res;
    }
}
