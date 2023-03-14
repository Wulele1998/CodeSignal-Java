package intro;

import java.util.LinkedList;
import java.util.List;

public class AllLongestStrings {
    String[] solution(String[] inputArray) {
        // N: the length of `inputArray`
        // time: O(N)
        // space: O(1)
        int maxLen = 0;
        List<String> resList = new LinkedList<>();
        for (String s : inputArray) {
            maxLen = Math.max(maxLen, s.length());
        }
        for (String s : inputArray) {
            if (s.length() == maxLen) {
                resList.add(s);
            }
        }
        String[] res = new String[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            res[i] = resList.get(i);
        }
        return res;
    }

}
