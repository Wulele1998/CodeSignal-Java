package intro;

public class ArrayMaxConsecutiveSum {
    int solution(int[] inputArray, int k) {
        // slide window
        int sum = 0;
        int result;

        for (int i = 0; i < k; i++) {
            sum += inputArray[i];
        }

        result = sum;
        for (int i = k; i < inputArray.length; i++) {
            sum -= inputArray[i - k];
            sum += inputArray[i];
            result = Math.max(result, sum);
        }

        return result;
    }
}
