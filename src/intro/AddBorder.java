package intro;

public class AddBorder {
    String[] solution(String[] picture) {
        // M: the length of `picture`
        // N: the length of each string
        // time: O(M)
        // space: O(N)
        int m = picture.length;
        int n = picture[0].length();

        String[] res = new String[m + 2];
        StringBuilder sb = new StringBuilder();
        sb.append("*".repeat(n + 2));

        res[0] = sb.toString();
        res[m + 1] = sb.toString();

        int index = 1;
        for (String s : picture) {
            sb = new StringBuilder();
            sb.append('*');
            sb.append(s);
            sb.append('*');
            res[index++] = sb.toString();
        }

        return res;
    }
}
