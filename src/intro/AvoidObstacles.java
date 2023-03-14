package intro;

import java.util.HashSet;

public class AvoidObstacles {
    int solution(int[] inputArray) {
        // N: the length of `inputArray`
        // M: the max number in the array
        // time: O(N * M)
        // space: O(N)
        int maxNum = inputArray[0];
        HashSet<Integer> set = new HashSet<>();
        set.add(inputArray[0]);
        int n = inputArray.length;
        for (int i = 1; i < n; i++) {
            maxNum = Math.max(maxNum, inputArray[i]);
            set.add(inputArray[i]);
        }

        int maxStep = maxNum + 1;

        for (int i = 1; i <= maxStep; i++) {
            if (set.contains(i)) {
                continue;
            }
            if (isValid(i, inputArray)) {
                return i;
            }
        }

        return maxStep;
    }

    boolean isValid(int step, int[] nums) {
        for (int num : nums) {
            if (num % step == 0) {
                return false;
            }
        }
        return true;
    }
}
