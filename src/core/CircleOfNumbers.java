package core;

public class CircleOfNumbers {
    int solution(int n, int firstNumber) {
        // time: O(1)
        // space: O(1)
        return (firstNumber + n / 2) % n;
    }
}
