package intro;

public class StringRearrangement {
    boolean res = false;
    boolean[] visited;
    boolean solution(String[] inputArray) {
        visited = new boolean[inputArray.length];
        findSequence(inputArray, null, visited, 0);
        return res;
    }

    void findSequence(String[] strArray, String prev, boolean[] visited, int number) {
        if (number == strArray.length) {
            res = true;
            return;
        }

        for (int i = 0; i < strArray.length; i++) {
            if (!visited[i] && (prev == null || differ(prev, strArray[i]))) {
                visited[i] = true;
                findSequence(strArray, strArray[i], visited, number + 1);
                // backtrack
                visited[i] = false;
            }
        }
    }

    boolean differ(String s, String t) {
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                count++;
            }
        }

        return count == 1;
    }
}
