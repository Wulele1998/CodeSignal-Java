package intro;

import java.util.ArrayList;

public class extractEachKth {
    int[] solution(int[] inputArray, int k) {
        // N: the length of `inputArray`
        // time: O(N)
        // space: O(N)
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < inputArray.length; i++) {
            if ((i + 1) % k != 0) {
                list.add(inputArray[i]);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}
