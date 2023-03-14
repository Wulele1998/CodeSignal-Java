package intro;

public class CheckPalindrome {
    boolean solution(String inputString) {
        // N: the length of `inputString`
        // time: O(N)
        // space: O(1)
        int left = 0;
        int right = inputString.length() - 1;

        while (left < right) {
            if (inputString.charAt(left) == inputString.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }
}
