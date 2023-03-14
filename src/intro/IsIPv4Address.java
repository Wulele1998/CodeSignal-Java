package intro;

public class IsIPv4Address {
    boolean solution(String inputString) {
        // time: O(1)
        // space: O(1)
        String[] parts = inputString.split("\\.");
        if (parts.length != 4) {
            return false;
        }
        for (String s : parts) {
            if (s.isEmpty()) {
                return false;
            }
            if (s.length() > 3) {
                return false;
            }
            for (char c : s.toCharArray()) {
                if (!Character.isDigit(c)) {
                    return false;
                }
            }
            // cannot start with 0
            if (s.length() > 1 && s.charAt(0) == '0') {
                return false;
            }
            if (Integer.parseInt(s) > 255) {
                return false;
            }
        }

        return true;
    }
}
