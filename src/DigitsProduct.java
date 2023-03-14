import java.util.ArrayList;

public class DigitsProduct {
    ArrayList<Integer> list = new ArrayList<>();
    boolean flag = true;
    int solution(int product) {
        if (product == 0)
            return 10;

        helper(product);

        if (!flag)
            return -1;

        int base = 1;
        int res = 0;
        for (int num : list) {
            res += base * num;
            base *= 10;
        }

        return res;
    }

    void helper(int n) {
        if (n < 10) {
            list.add(n);
            return;
        }
        for (int i = 9; i >= 2; i--) {
            if (n % i == 0) {
                list.add(i);
                helper(n / i);
                return;
            }
        }
        flag = false;
    }
}


