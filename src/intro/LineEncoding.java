package intro;

import java.util.ArrayList;

public class LineEncoding {
    String solution(String s) {
        ArrayList<Character> letter = new ArrayList<>();
        ArrayList<Integer> times = new ArrayList<>();
        int n = s.length();
        int count = 1;
        for (int i = 1; i < n; i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                letter.add(s.charAt(i - 1));
                times.add(count);
                count = 1;
            }
        }
        letter.add(s.charAt(n - 1));
        times.add(count);

        System.out.println(letter);
        System.out.println(times);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < letter.size(); i++) {
            if (times.get(i) > 1) {
                sb.append(times.get(i));
            }
            sb.append(letter.get(i));
        }

        return sb.toString();
    }
}
