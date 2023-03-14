package intro;

public class AlphabeticShift {
    String solution(String inputString) {
        char[] res = new char[inputString.length()];
        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == 'z') {
                res[i] = 'a';
            } else {
                res[i] = (char) (inputString.charAt(i) + 1);
            }
        }
        return new String(res);
    }
}
