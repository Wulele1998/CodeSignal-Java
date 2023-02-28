public class DepositProfit {
    int solution(int deposit, int rate, int threshold) {
        int year = 0;
        double d = deposit;
        while (d < threshold) {
            d *= (1.0 + rate / 100.0);
            year++;
        }
        return year;
    }
}
