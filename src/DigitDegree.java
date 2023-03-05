public class DigitDegree {
    int solution(int n) {
        int count = 0;
        while (n > 9) {
            n = digitSum(n);
            count++;
        }

        return count;
    }

    int digitSum(int n) {
        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return sum;
    }
}
