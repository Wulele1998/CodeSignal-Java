package intro;

public class IsMAC48Address {
    boolean solution(String inputString) {
        // time: O(1)
        // space: O(1)
        int n = inputString.length();
        if (n != 17) {
            return false;
        }

        String[] parts = inputString.split("-");
        if (parts.length != 6) {
            return false;
        }

        for (String part : parts) {
            if (part.length() != 2) {
                return false;
            }
            for (char c : part.toCharArray()) {
                if (!Character.isDigit(c) && (c < 'A' || c > 'F')) {
                    return false;
                }
            }
        }

        return true;
    }
}
