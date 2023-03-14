package intro;

import java.util.ArrayList;

public class IsSimilar {
    boolean solution(int[] a, int[] b) {
        // N: the length of `a` and `b`
        // time: O(N)
        // space: O(1)
        if (a.length != b.length) {
            return false;
        }

        int n = a.length;
        ArrayList<Integer> diff = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (a[i] != b[i]) {
                diff.add(a[i]);
                diff.add(b[i]);
            }
        }

        if (diff.size() == 0) {
            return true;
        }

        if (diff.size() != 4) {
            return false;
        }

        return diff.get(0).equals(diff.get(3)) && diff.get(1).equals(diff.get(2));
    }
}
