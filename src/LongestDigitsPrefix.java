public class LongestDigitsPrefix {
    String solution(String inputString) {
        // N: the length of `inputString`
        // time: O(N)
        // space: O(1)
        int index = 0;
        while (index < inputString.length() && Character.isDigit(inputString.charAt(index))) {
            index++;
        }
        return inputString.substring(0, index);
    }
}
