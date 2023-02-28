public class IsLucky {
    boolean solution(int n) {
        // N: n
        // time: O(N)
        // space: O(N) => string
        String str = Integer.toString(n);
        int len = str.length();

        if (len % 2 != 0) {
            return false;
        }

        int leftHalf = 0;
        int rightHalf = 0;
        for (int i = 0, j = len / 2; i < len / 2 && j < len; i++, j++) {
            leftHalf += str.charAt(i) - '0';
            rightHalf += str.charAt(j) - '0';
        }

        return leftHalf == rightHalf;
    }
}
