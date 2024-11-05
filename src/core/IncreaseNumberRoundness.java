package core;

public class IncreaseNumberRoundness {
    boolean solution(int n) {
        boolean flag = false;

        while (n > 0) {
            int digit = n % 10;
            if (digit != 0)
                flag = true;
            if (flag && digit == 0)
                return true;
            n /= 10;
        }

        return false;
    }
}
