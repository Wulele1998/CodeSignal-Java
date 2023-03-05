import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class StringRearrangement2 {
    boolean solution(String[] inputArray) {
        // use deque
        // N: the length of `inputArray`
        // time: O(N ^ 2)
        // space: O(1)
        Deque<String> res = new LinkedList<>();
        Deque<String> deque = new LinkedList<>(Arrays.asList(inputArray));

        res.add(deque.removeFirst());
        while (!deque.isEmpty()) {
            int n = deque.size();
            String first = res.getFirst();
            String last = res.getLast();

            for (int i = 0; i < n; i++) {
                String cur = deque.removeFirst();
                if (differ(cur, first)) {
                    res.offerFirst(cur);
                    break;
                } else if (differ(cur, last)) {
                    res.offerLast(cur);
                    break;
                } else {
                    deque.addLast(cur);
                }
            }

            if (deque.size() == n) {
                // no elements is added into the res deque
                return false;
            }
        }

        return true;
    }

    private boolean differ(String s, String t) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                count++;
            }
        }

        return count == 1;
    }
}
