package intro;

import java.util.HashSet;

public class DifferentSymbolsNaive {
    int solution(String s) {
        // N: the length of `s`
        // time: O(N)
        // space: O(N)
        HashSet<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }
        return set.size();
    }
}
