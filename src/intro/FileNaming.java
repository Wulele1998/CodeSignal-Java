package intro;

import java.util.HashMap;

public class FileNaming {
    String[] solution(String[] names) {
        // N: the length of `names`
        // time: O(N)
        // space: O(N) => HashMap
        HashMap<String, Integer> map = new HashMap<>();
        int n = names.length;
        String[] res = new String[n];

        for (int i = 0; i < n; i++) {
            String name = names[i];
            if (map.containsKey(name)) {
                StringBuilder sb = new StringBuilder(name);
                sb.append("(");
                sb.append(map.get(name));
                sb.append(")");

                while (map.containsKey(sb.toString())) {
                    map.put(name, map.get(name) + 1);
                    sb = new StringBuilder(name);
                    sb.append("(");
                    sb.append(map.get(name));
                    sb.append(")");
                }
                res[i] = sb.toString();
                map.put(sb.toString(), 1);
            } else {
                res[i] = name;
            }
            map.put(name, map.getOrDefault(name, 0) + 1);
        }

        return res;
    }
}
