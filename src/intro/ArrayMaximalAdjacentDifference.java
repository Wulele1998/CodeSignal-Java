package intro;

public class ArrayMaximalAdjacentDifference {
    int solution(int[] inputArray) {
        // N: the length of array
        // time: O(N)
        // space: O(N)
        int n = inputArray.length;
        int res = 0;
        for (int i = 1; i < n; i++) {
            res = Math.max(res, Math.abs(inputArray[i] - inputArray[i - 1]));
        }
        return res;
    }
}
