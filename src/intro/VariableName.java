package intro;

public class VariableName {
    boolean solution(String name) {
        for (char c : name.toCharArray()) {
            if (!Character.isLetterOrDigit(c) && c != '_') {
                return false;
            }
        }
        return !Character.isDigit(name.charAt(0));
    }
}
