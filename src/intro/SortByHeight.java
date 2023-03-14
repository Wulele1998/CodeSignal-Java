package intro;

import java.util.ArrayList;
import java.util.Collections;

public class SortByHeight {
    int[] solution(int[] a) {
        // N: the length of `a`
        // time: O(N log N) => sort
        // space: O(N)
        int n = a.length;
        int index = 0;
        ArrayList<Integer> list = new ArrayList<>();

        for (int h : a) {
            if (h != -1) {
                list.add(h);
            }
        }

        Collections.sort(list);

        for (int i = 0; i < n; i++) {
            if (a[i] != -1) {
                a[i] = list.get(index++);
            }
        }

        return a;
    }
}
