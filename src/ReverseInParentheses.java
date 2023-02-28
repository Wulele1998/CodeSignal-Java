import java.util.ArrayList;
import java.util.Stack;

public class ReverseInParentheses {
    String solution(String inputString) {
        // N: the length of `inputString`
        // time: O(N)
        // space: O(N)
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();

        for (char c : inputString.toCharArray()) {
            if (c == ')') {
                ArrayList<Character> temp = new ArrayList<>();
                while (!stack.isEmpty() && stack.peek() != '(') {
                    temp.add(stack.pop());
                }
                stack.pop(); // pop (
                for (char ch : temp) {
                    stack.push(ch);
                }
            } else {
                stack.push(c);
            }
        }

        for (char c : stack) {
            sb.append(c);
        }

        return sb.toString();
    }
}
