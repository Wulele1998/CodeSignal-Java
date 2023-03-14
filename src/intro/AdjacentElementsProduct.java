package intro;

public class AdjacentElementsProduct {
    int solution(int[] inputArray) {
        // N: the length of input array
        // time: O(N)
        // space: O(N)
        int n = inputArray.length;
        int maxRes = inputArray[0] * inputArray[1];

        for (int i = 1; i < n - 1; i++) {
            maxRes = Math.max(maxRes, inputArray[i] * inputArray[i + 1]);
        }

        return maxRes;
    }
}
