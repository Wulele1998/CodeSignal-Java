package intro;

public class FindEmailDomain {
    String solution(String address) {
        int n = address.length();
        int index = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (address.charAt(i) == '@') {
                index = i;
                break;
            }
        }
        if (index != -1) {
            return address.substring(index + 1);
        }

        return "";
    }
}
