package core;

public class ArithmeticExpression {
    boolean solution(int a, int b, int c) {
        if (a + b == c)
            return true;
        if (a - b == c)
            return true;
        if (a * b == c)
            return true;
        if (b != 0 && b * c == a)
            return true;

        return false;
    }
}
