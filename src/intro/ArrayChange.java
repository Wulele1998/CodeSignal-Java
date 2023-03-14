package intro;

public class ArrayChange {
    int solution(int[] inputArray) {
        // N: the length of `inputArray`
        // time: O(N)
        // space: O(1)
        int res = 0;
        int n = inputArray.length;
        int base = inputArray[0];
        for (int i = 1; i < n; i++) {
            if (inputArray[i] <= base + 1) {
                res += base + 1 - inputArray[i];
                base++;
            } else {
                base = inputArray[i];
            }
        }

        return res;
    }
}
